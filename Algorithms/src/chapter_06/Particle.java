/**
 * Algorithms
 *
 * @version 4th
 * @author Robert Sedgewick
 * @author Kevin Wayne
 * @see http://algs4.cs.princeton.edu
 */

import java.awt.Color;

public class Particle {
    private static final double INFINITY = Double.POSITIVE_INFINITY;

    // position
    private double rx;
    private double ry;
    // velocity
    private double vx;
    private double vy;
    // number of collisions so far
    private int count;
    // radius
    private final double radius;
    // mass
    private final double mass;
    // color
    private final Color color;

    /**
     * Initializes a particle with the specified position, velocity, radius, mass, and color.
     * 
     * @param rx x-coordinate of position
     * @param ry y-coordinate of position
     * @param vx x-coordinate of velocity
     * @param vy y-coordinate of velocity
     * @param radius the radius
     * @param mass the mass
     * @param color the color
     */
    public Particle(double rx, double ry, double vx, double vy, double radius, double mass, Color color) {
        this.rx = rx;
        this.ry = ry;
        this.vx = vx;
        this.vy = vy;
        this.radius = radius;
        this.mass = mass;
        this.color = color;
    }

    /**
     * Initializes a particle with a random position and velocity.
     */
    public Particle() {
        rx = StdRandom.uniform(0.0, 1.0);
        ry = StdRandom.uniform(0.0, 1.0);
        vx = StdRandom.uniform(-0.005, 0.005);
        vy = StdRandom.uniform(-0.005, 0.005);
        radius = 0.02;
        mass = 0.5;
        color = Color.BLACK;
    }

    /**
     * Moves this particle in a straight line for the specified amount of time.
     * 
     * @param dt the amount of time
     */
    public void move(double dt) {
        rx += vx * dt;
        ry += vy * dt;
    }

    /**
     * Draws this particle to standard draw.
     */
    public void draw() {
        StdDraw.setPenColor(color);
        StdDraw.filledCircle(rx, ry, radius);
    }

    /**
     * Returns the number of collisions involving the particle with verticals walls,
     * horizontal walls, or other particles.
     * 
     * @return the number of collisions involving the particle with verticals walls,
     * horizontal walls, or other particles
     */
    public int count() {
        return count;
    }

    /**
     * Returns the amount of time for the particle to collide with 
     * the specified particle, assuming no interening collisions.
     * 
     * @param that the other particle
     * @return the amount of time for the particle to collide with 
     *         the specified particle, assuming no interening collisions;
     *         {@code Double.POSITIVE_INFINITY} if the particles will no collide
     */
    public double timeToHit(Particle that) {
        if (this == that) {
            return INFINITY;
        }

        double dx = that.rx - this.rx;
        double dy = that.ry - this.ry;
        double dvx = that.vx - this.vx;
        double dvy = that.vy - this.vy;
        double dvdr = dx * dvx + dy * dvy;
        if (dvdr > 0) {
            return INFINITY;
        }
        double dvdv = dvx * dvx + dvy * dvy;
        if (dvdv == 0) {
            return INFINITY;
        }
        double drdr = dx * dx + dy * dy;
        double sigma = this.radius + that.radius;
        double d = (dvdr * dvdr) - dvdv * (drdr - sigma * sigma);
        if (d < 0) {
            return INFINITY;
        }
        return -(dvdr + Math.sqrt(d)) / dvdv;
    }

    /**
     * Returns the amount of time for the particle to collide with a vertical
     * wall, assuming no interening collisions.
     * 
     * @return the amount of time for the particle to collide with a vertical wall
     *         assuming no interning collisions;
     *         {@code Double.POSITIVE_INFINITY} if the particle will not collide 
     *         with a vertical wall
     */
    public double timeToHitVerticalWall() {
        if (vx > 0) {
            return (1.0 - rx - radius) / vx;
        } else if (vx < 0) {
            return (radius - rx) / vx;
        } else {
            return INFINITY;
        }
    }

    /**
     * Returns the amount of time for the particle to collide with a horizontal
     * wall, assuming no interening collisions.
     * 
     * @return the amount of time for the particle to collide with a horizontal wall
     *         assuming no interning collisions;
     *         {@code Double.POSITIVE_INFINITY} if the particle will not collide 
     *         with a horizontal wall
     */
    public double timeToHitHorizontalWall() {
        if (vy > 0) {
            return (1.0 - ry - radius) / vy;
        } else if (vy < 0) {
            return (radius - ry) / vy;
        } else {
            return INFINITY;
        }
    }

    /**
     * Updates the velocities of the particle and the specified particle according
     * to the laws of elastic collision.
     * 
     * @param that the other particle
     */
    public void bounceOff(Particle that) {
        double dx = that.rx - this.rx;
        double dy = that.ry - this.ry;
        double dvx = that.vx - this.vx;
        double dvy = that.vy - this.vy;
        double dvdr = dx * dvx + dy * dvy;
        double dist = this.radius + that.radius;

        // magnitude of normal force
        double magnitude = 2 * this.mass * that.mass * dvdr / ((this.mass + that.mass) * dist);

        // normal force, and in x and y directions
        double fx = magnitude * dx / dist;
        double fy = magnitude * dy / dist;

        // update velocities according to normal force
        this.vx += fx / this.mass;
        this.vy += fy / this.mass;
        that.vx -= fx / that.mass;
        that.vy -= fy / that.mass;

        // update collision counts
        this.count++;
        that.count++;
    }

    /**
     * Updates the velocity of the particle upon collision with a vertical wall.
     */
    public void bounceOffVerticalWall() {
        vx = -vx;
        count++;
    }

    /**
     * Updates the velocity of the particle upon collision with a horizontal wall.
     */
    public void bounceOffHorizontalWall() {
        vy = -vy;
        count++;
    }

    /**
     * Returns the kinetic energy of the particle.
     * 
     * @return the ninetic energy of the particle
     */
    public double kineticEnergy() {
        return 0.5 * mass * (vx * vx + vy * vy);
    }
}
