package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.function.Consumer;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class p extends j {
    public static final LocalDate h = LocalDate.of(2000, 1, 1);
    public final ChronoLocalDate g;

    public p(TemporalField temporalField, int i, int i2, ChronoLocalDate chronoLocalDate, int i3) {
        super(temporalField, i, i2, SignStyle.NOT_NEGATIVE, i3);
        this.g = chronoLocalDate;
    }

    @Override // j$.time.format.j
    public final long a(x xVar, long j) {
        int i;
        long abs = Math.abs(j);
        ChronoLocalDate chronoLocalDate = this.g;
        if (chronoLocalDate != null) {
            i = j$.time.chrono.j.q(xVar.a).G(chronoLocalDate).h(this.a);
        } else {
            i = 0;
        }
        long j2 = i;
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        long[] jArr = j.f;
        if (i2 >= 0) {
            long j3 = jArr[this.b];
            if (j < j2 + j3) {
                return abs % j3;
            }
        }
        return abs % jArr[this.c];
    }

    @Override // j$.time.format.j
    public final boolean b(v vVar) {
        if (!vVar.c) {
            return false;
        }
        return super.b(vVar);
    }

    @Override // j$.time.format.j
    public final int c(final v vVar, long j, final int i, final int i2) {
        final p pVar;
        v vVar2;
        final long j2;
        int i3;
        long j3;
        long j4;
        ChronoLocalDate chronoLocalDate = this.g;
        if (chronoLocalDate != null) {
            i3 = vVar.d().G(chronoLocalDate).h(this.a);
            pVar = this;
            j2 = j;
            Consumer consumer = new Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    j$.time.chrono.j jVar = (j$.time.chrono.j) obj;
                    p.this.c(vVar, j2, i, i2);
                }
            };
            vVar2 = vVar;
            if (vVar2.e == null) {
                vVar2.e = new ArrayList();
            }
            vVar2.e.add(consumer);
        } else {
            pVar = this;
            vVar2 = vVar;
            j2 = j;
            i3 = 0;
        }
        int i4 = i2 - i;
        int i5 = pVar.b;
        if (i4 == i5 && j2 >= 0) {
            long j5 = j.f[i5];
            long j6 = i3;
            long j7 = j6 - (j6 % j5);
            if (i3 > 0) {
                j4 = j7 + j2;
            } else {
                j4 = j7 - j2;
            }
            if (j4 < j6) {
                j3 = j5 + j4;
            } else {
                j3 = j4;
            }
        } else {
            j3 = j2;
        }
        return vVar2.g(pVar.a, j3, i, i2);
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.e == -1) {
            return this;
        }
        return new p(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i) {
        return new p(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        Object obj = 0;
        Object obj2 = this.g;
        if (obj2 != null) {
            obj = obj2;
        }
        return "ReducedValue(" + this.a + "," + this.b + "," + this.c + "," + obj + ")";
    }
}
