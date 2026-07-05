package defpackage;

import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.Month;
import j$.time.chrono.ChronoLocalDate;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = ut6.class)
/* renamed from: nt6  reason: default package */
/* loaded from: classes3.dex */
public final class nt6 implements Comparable<nt6>, Serializable {
    public static final lt6 Companion = new Object();
    public final LocalDate a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lt6] */
    static {
        LocalDate localDate = LocalDate.MIN;
        localDate.getClass();
        new nt6(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        localDate2.getClass();
        new nt6(localDate2);
    }

    public nt6(int i, int i2, int i3) {
        try {
            LocalDate of = LocalDate.of(i, i2, i3);
            of.getClass();
            this.a = of;
        } catch (DateTimeException e) {
            xk5.m(e);
            throw null;
        }
    }

    public final zj2 a() {
        DayOfWeek dayOfWeek = this.a.getDayOfWeek();
        dayOfWeek.getClass();
        return (zj2) zj2.b.get(dayOfWeek.getValue() - 1);
    }

    public final zq7 b() {
        Month month = this.a.getMonth();
        month.getClass();
        return (zq7) zq7.b.get(month.getValue() - 1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(nt6 nt6Var) {
        nt6 nt6Var2 = nt6Var;
        nt6Var2.getClass();
        return this.a.compareTo((ChronoLocalDate) nt6Var2.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nt6) {
                if (!c16.i(this.a, ((nt6) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String localDate = this.a.toString();
        localDate.getClass();
        return localDate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nt6(int i, zq7 zq7Var, int i2) {
        this(i, zq7Var.ordinal() + 1, i2);
        zq7Var.getClass();
    }

    public nt6(LocalDate localDate) {
        localDate.getClass();
        this.a = localDate;
    }
}
