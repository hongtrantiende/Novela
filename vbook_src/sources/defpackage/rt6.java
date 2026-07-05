package defpackage;

import j$.time.DateTimeException;
import j$.time.LocalDate;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rt6  reason: default package */
/* loaded from: classes3.dex */
public abstract class rt6 {
    public static final long a = LocalDate.MIN.toEpochDay();
    public static final long b = LocalDate.MAX.toEpochDay();

    public static final nt6 a(nt6 nt6Var, long j, jj2 jj2Var) {
        LocalDate plusMonths;
        LocalDate localDate = nt6Var.a;
        jj2Var.getClass();
        try {
            if (jj2Var instanceof lj2) {
                long addExact = Math.addExact(localDate.toEpochDay(), Math.multiplyExact(j, ((lj2) jj2Var).d));
                long j2 = a;
                if (addExact <= b && j2 <= addExact) {
                    plusMonths = LocalDate.ofEpochDay(addExact);
                    plusMonths.getClass();
                } else {
                    throw new DateTimeException("The resulting day " + addExact + " is out of supported LocalDate range.");
                }
            } else if (jj2Var instanceof nj2) {
                plusMonths = localDate.plusMonths(Math.multiplyExact(j, ((nj2) jj2Var).d));
            } else {
                throw new gt1(7);
            }
            return new nt6(plusMonths);
        } catch (Exception e) {
            if (!(e instanceof DateTimeException) && !(e instanceof ArithmeticException)) {
                throw e;
            }
            throw new gt1(1, "The result of adding " + j + " of " + jj2Var + " to " + nt6Var + " is out of LocalDate range.", e);
        }
    }

    public static final nt6 b(nt6 nt6Var, ri2 ri2Var) {
        LocalDate localDate;
        LocalDate localDate2 = nt6Var.a;
        try {
            long j = ri2Var.a;
            if (j != 0) {
                localDate = localDate2.plusMonths(j);
            } else {
                localDate = localDate2;
            }
            int i = ri2Var.b;
            if (i != 0) {
                localDate = localDate.plusDays(i);
            }
            return new nt6(localDate);
        } catch (DateTimeException unused) {
            throw new gt1("The result of adding " + localDate2 + " to " + nt6Var + " is out of LocalDate range.", 1);
        }
    }
}
