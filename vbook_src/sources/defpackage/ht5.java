package defpackage;

import j$.time.LocalDate;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ht5  reason: default package */
/* loaded from: classes3.dex */
public final class ht5 implements jpd, ki2, b72 {
    public final mt5 a;
    public Integer b;
    public Integer c;
    public Integer d;

    public ht5(mt5 mt5Var, Integer num, Integer num2, Integer num3) {
        this.a = mt5Var;
        this.b = num;
        this.c = num2;
        this.d = num3;
    }

    public final nt6 a() {
        nt6 nt6Var;
        mt5 mt5Var = this.a;
        Integer num = mt5Var.a;
        ppd.a(num, "year");
        int intValue = num.intValue();
        Integer num2 = this.d;
        if (num2 == null) {
            Integer num3 = mt5Var.b;
            ppd.a(num3, "monthNumber");
            int intValue2 = num3.intValue();
            Integer num4 = this.b;
            ppd.a(num4, "day");
            nt6Var = new nt6(intValue, intValue2, num4.intValue());
        } else {
            nt6 nt6Var2 = new nt6(intValue, 1, 1);
            qj2.Companion.getClass();
            lj2 lj2Var = qj2.a;
            lj2Var.getClass();
            nt6 a = rt6.a(nt6Var2, num2.intValue() - 1, lj2Var);
            LocalDate localDate = a.a;
            if (localDate.getYear() == intValue) {
                if (mt5Var.b != null) {
                    zq7 b = a.b();
                    b.getClass();
                    int ordinal = b.ordinal() + 1;
                    Integer num5 = mt5Var.b;
                    if (num5 == null || ordinal != num5.intValue()) {
                        StringBuilder sb = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb.append(num2);
                        sb.append(", which is ");
                        sb.append(a.b());
                        Integer num6 = mt5Var.b;
                        sb.append(", but ");
                        sb.append(num6);
                        sb.append(" was specified as the month number");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                if (this.b != null) {
                    int dayOfMonth = localDate.getDayOfMonth();
                    Integer num7 = this.b;
                    if (num7 == null || dayOfMonth != num7.intValue()) {
                        StringBuilder sb2 = new StringBuilder("Can not create a LocalDate from the given input: the day of year is ");
                        sb2.append(num2);
                        sb2.append(", which is the day ");
                        sb2.append(localDate.getDayOfMonth());
                        sb2.append(" of ");
                        sb2.append(a.b());
                        Integer num8 = this.b;
                        sb2.append(", but ");
                        sb2.append(num8);
                        sb2.append(" was specified as the day of month");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                nt6Var = a;
            } else {
                throw new IllegalArgumentException("Can not create a LocalDate from the given input: the day of year is " + num2 + ", which is not a valid day of year for the year " + intValue);
            }
        }
        Integer num9 = this.c;
        if (num9 != null) {
            int intValue3 = num9.intValue();
            zj2 a2 = nt6Var.a();
            a2.getClass();
            if (intValue3 != a2.ordinal() + 1) {
                StringBuilder sb3 = new StringBuilder("Can not create a LocalDate from the given input: the day of week is ");
                if (1 <= intValue3 && intValue3 < 8) {
                    sb3.append((zj2) zj2.b.get(intValue3 - 1));
                    sb3.append(" but the date is ");
                    sb3.append(nt6Var);
                    sb3.append(", which is a ");
                    sb3.append(nt6Var.a());
                    throw new IllegalArgumentException(sb3.toString());
                }
                p1a.k(a82.j(intValue3, "Expected ISO day-of-week number in 1..7, got "));
                return null;
            }
        }
        return nt6Var;
    }

    @Override // defpackage.b72
    public final Object c() {
        mt5 mt5Var = this.a;
        return new ht5(new mt5(mt5Var.a, mt5Var.b), this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ht5) {
            ht5 ht5Var = (ht5) obj;
            if (c16.i(this.a, ht5Var.a) && c16.i(this.b, ht5Var.b) && c16.i(this.c, ht5Var.c) && c16.i(this.d, ht5Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.jpd
    public final void f(Integer num) {
        this.a.b = num;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.a.hashCode() * 29791;
        Integer num = this.b;
        int i3 = 0;
        if (num != null) {
            i = num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i * 961) + hashCode;
        Integer num2 = this.c;
        if (num2 != null) {
            i2 = num2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i2 * 31) + i4;
        Integer num3 = this.d;
        if (num3 != null) {
            i3 = num3.hashCode();
        }
        return i5 + i3;
    }

    @Override // defpackage.jpd
    public final Integer i() {
        return this.a.a;
    }

    @Override // defpackage.ki2
    public final Integer j() {
        return this.c;
    }

    @Override // defpackage.ki2
    public final Integer n() {
        return this.b;
    }

    @Override // defpackage.ki2
    public final void o(Integer num) {
        this.b = num;
    }

    @Override // defpackage.ki2
    public final Integer q() {
        return this.d;
    }

    @Override // defpackage.jpd
    public final void r(Integer num) {
        this.a.a = num;
    }

    @Override // defpackage.jpd
    public final Integer s() {
        return this.a.b;
    }

    @Override // defpackage.ki2
    public final void t(Integer num) {
        this.c = num;
    }

    public final String toString() {
        Integer num = this.d;
        mt5 mt5Var = this.a;
        Object obj = "??";
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(mt5Var);
            sb.append('-');
            Integer num2 = this.b;
            if (num2 == null) {
                num2 = "??";
            }
            sb.append(num2);
            sb.append(" (day of week is ");
            Object obj2 = this.c;
            if (obj2 != null) {
                obj = obj2;
            }
            sb.append(obj);
            sb.append(')');
            return sb.toString();
        } else if (this.b == null && mt5Var.b == null) {
            StringBuilder sb2 = new StringBuilder("(");
            Integer num3 = mt5Var.a;
            if (num3 == null) {
                num3 = "??";
            }
            sb2.append(num3);
            sb2.append(")-");
            sb2.append(this.d);
            sb2.append(" (day of week is ");
            Object obj3 = this.c;
            if (obj3 != null) {
                obj = obj3;
            }
            sb2.append(obj);
            sb2.append(')');
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(mt5Var);
            sb3.append('-');
            Integer num4 = this.b;
            if (num4 == null) {
                num4 = "??";
            }
            sb3.append(num4);
            sb3.append(" (day of week is ");
            Object obj4 = this.c;
            if (obj4 != null) {
                obj = obj4;
            }
            sb3.append(obj);
            sb3.append(", day of year is ");
            sb3.append(this.d);
            sb3.append(')');
            return sb3.toString();
        }
    }

    @Override // defpackage.ki2
    public final void y(Integer num) {
        this.d = num;
    }

    public /* synthetic */ ht5() {
        this(new mt5(null, null), null, null, null);
    }
}
