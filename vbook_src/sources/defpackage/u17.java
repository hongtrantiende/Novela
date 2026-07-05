package defpackage;

import java.util.HashMap;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u17  reason: default package */
/* loaded from: classes.dex */
public final class u17 extends kr4 {
    public static final Object f = new Object();
    public final /* synthetic */ int c = 0;
    public final Object d;
    public final Object e;

    public u17(aac aacVar, HashMap hashMap) {
        super(aacVar);
        int o = aacVar.o();
        this.e = new long[aacVar.o()];
        z9c z9cVar = new z9c();
        for (int i = 0; i < o; i++) {
            ((long[]) this.e)[i] = aacVar.m(i, z9cVar, 0L).l;
        }
        int h = aacVar.h();
        this.d = new long[h];
        y9c y9cVar = new y9c();
        for (int i2 = 0; i2 < h; i2++) {
            aacVar.f(i2, y9cVar, true);
            Long l = (Long) hashMap.get(y9cVar.b);
            l.getClass();
            long longValue = l.longValue();
            long[] jArr = (long[]) this.d;
            longValue = longValue == Long.MIN_VALUE ? y9cVar.d : longValue;
            jArr[i2] = longValue;
            long j = y9cVar.d;
            if (j != -9223372036854775807L) {
                long[] jArr2 = (long[]) this.e;
                int i3 = y9cVar.c;
                jArr2[i3] = jArr2[i3] - (j - longValue);
            }
        }
    }

    @Override // defpackage.kr4, defpackage.aac
    public int b(Object obj) {
        Object obj2;
        switch (this.c) {
            case 0:
                if (f == obj && (obj2 = this.e) != null) {
                    obj = obj2;
                }
                return this.b.b(obj);
            default:
                return super.b(obj);
        }
    }

    @Override // defpackage.kr4, defpackage.aac
    public final y9c f(int i, y9c y9cVar, boolean z) {
        switch (this.c) {
            case 0:
                this.b.f(i, y9cVar, z);
                if (Objects.equals(y9cVar.b, this.e) && z) {
                    y9cVar.b = f;
                }
                return y9cVar;
            default:
                super.f(i, y9cVar, z);
                y9cVar.d = ((long[]) this.d)[i];
                return y9cVar;
        }
    }

    @Override // defpackage.kr4, defpackage.aac
    public Object l(int i) {
        switch (this.c) {
            case 0:
                Object l = this.b.l(i);
                if (Objects.equals(l, this.e)) {
                    return f;
                }
                return l;
            default:
                return super.l(i);
        }
    }

    @Override // defpackage.kr4, defpackage.aac
    public final z9c m(int i, z9c z9cVar, long j) {
        long j2;
        switch (this.c) {
            case 0:
                this.b.m(i, z9cVar, j);
                if (Objects.equals(z9cVar.a, this.d)) {
                    z9cVar.a = z9c.p;
                }
                return z9cVar;
            default:
                super.m(i, z9cVar, j);
                long j3 = ((long[]) this.e)[i];
                z9cVar.l = j3;
                if (j3 != -9223372036854775807L) {
                    long j4 = z9cVar.k;
                    if (j4 != -9223372036854775807L) {
                        j2 = Math.min(j4, j3);
                        z9cVar.k = j2;
                        return z9cVar;
                    }
                }
                j2 = z9cVar.k;
                z9cVar.k = j2;
                return z9cVar;
        }
    }

    public u17(aac aacVar, Object obj, Object obj2) {
        super(aacVar);
        this.d = obj;
        this.e = obj2;
    }
}
