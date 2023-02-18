package Vector;

public class Vec2d {
    private float x, y;

    public Vec2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
    }

    public void setX(float newX) {
        this.x = newX;
    }
    public void setY(float newY) {
        this.y = newY;
    }

    public float getMagnitude() {
        return (float) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public Vec2d addVec(Vec2d v2) {
        return new Vec2d(this.x + v2.getX(), this.y + v2.getY());
    }

    public Vec2d subVec(Vec2d v2) {
        return new Vec2d(this.x - v2.getX(), this.y - v2.getY());
    }

    public Vec2d multVec(float factor) {
        return new Vec2d(this.x * factor, this.y * factor);
    }

    public Vec2d divideVec(float divisor) {
        return new Vec2d(this.x / divisor, this.y / divisor);
    }

    public Vec2d normalizeVec() {
        float mag = this.getMagnitude();
        return this.divideVec(mag);
    }

    public Vec2d pointAt(Vec2d target) {
        Vec2d diff = target.subVec(this);
        return diff.normalizeVec();
    }
}
