package defpackage;

import j$.time.DateTimeException;
import j$.time.YearMonth;
import j$.time.format.DateTimeFormatter;
import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = rpd.class)
/* renamed from: ipd  reason: default package */
/* loaded from: classes3.dex */
public final class ipd implements Comparable<ipd>, Serializable {
    public static final hpd Companion = new Object();
    public final YearMonth a;

    public ipd(int i, int i2) {
        try {
            YearMonth of = YearMonth.of(i, i2);
            of.getClass();
            this.a = of;
        } catch (DateTimeException e) {
            xk5.m(e);
            throw null;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(ipd ipdVar) {
        ipd ipdVar2 = ipdVar;
        ipdVar2.getClass();
        return this.a.compareTo(ipdVar2.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ipd) {
                if (!c16.i(this.a, ((ipd) obj).a)) {
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
        String format = ((DateTimeFormatter) qpd.a.getValue()).format(this.a);
        format.getClass();
        return format;
    }

    public ipd(YearMonth yearMonth) {
        yearMonth.getClass();
        this.a = yearMonth;
    }
}
