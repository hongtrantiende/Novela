package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dff  reason: default package */
/* loaded from: classes.dex */
public final class dff extends tef {
    public final Serializable a;

    public dff(String str) {
        Objects.requireNonNull(str);
        this.a = str;
    }

    public static boolean d(dff dffVar) {
        Serializable serializable = dffVar.a;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final Number a() {
        Serializable serializable = this.a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new qhf((String) serializable);
        }
        xk5.q("Primitive is neither a number nor a string");
        return null;
    }

    public final String b() {
        Serializable serializable = this.a;
        if (!(serializable instanceof String)) {
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    return ((Boolean) serializable).toString();
                }
                vs.j("Unexpected value type: ".concat(String.valueOf(serializable.getClass())));
                return null;
            }
            return a().toString();
        }
        return (String) serializable;
    }

    public final BigInteger c() {
        Serializable serializable = this.a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (d(this)) {
            return BigInteger.valueOf(a().longValue());
        }
        String b = b();
        rqe.t(b);
        return new BigInteger(b);
    }

    public final boolean equals(Object obj) {
        double parseDouble;
        double parseDouble2;
        BigDecimal s;
        BigDecimal s2;
        if (this != obj) {
            if (obj != null && dff.class == obj.getClass()) {
                dff dffVar = (dff) obj;
                Serializable serializable = dffVar.a;
                Serializable serializable2 = this.a;
                if (serializable2 == null) {
                    if (serializable == null) {
                        return true;
                    }
                    return false;
                } else if (d(this) && d(dffVar)) {
                    if (!(serializable2 instanceof BigInteger) && !(serializable instanceof BigInteger)) {
                        if (a().longValue() == dffVar.a().longValue()) {
                            return true;
                        }
                        return false;
                    }
                    return c().equals(dffVar.c());
                } else if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
                    if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                        if (serializable2 instanceof BigDecimal) {
                            s = (BigDecimal) serializable2;
                        } else {
                            s = rqe.s(b());
                        }
                        if (serializable instanceof BigDecimal) {
                            s2 = (BigDecimal) serializable;
                        } else {
                            s2 = rqe.s(dffVar.b());
                        }
                        if (s.compareTo(s2) == 0) {
                            return true;
                        }
                        return false;
                    }
                    if (serializable2 instanceof Number) {
                        parseDouble = a().doubleValue();
                    } else {
                        parseDouble = Double.parseDouble(b());
                    }
                    if (serializable instanceof Number) {
                        parseDouble2 = dffVar.a().doubleValue();
                    } else {
                        parseDouble2 = Double.parseDouble(dffVar.b());
                    }
                    if (parseDouble != parseDouble2) {
                        if (Double.isNaN(parseDouble) && Double.isNaN(parseDouble2)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                } else {
                    return serializable2.equals(serializable);
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.a;
        if (serializable == null) {
            return 31;
        }
        if (d(this)) {
            doubleToLongBits = a().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(a().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public dff(Number number) {
        this.a = number;
    }

    public dff(Boolean bool) {
        this.a = bool;
    }
}
