/**
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
    // automatically generated by Eclipse
    final int prime = 31;
    int result = 1;
    result = prime * result + Float.floatToIntBits(x);
    result = prime * result + Float.floatToIntBits(y);
    return result;
}
