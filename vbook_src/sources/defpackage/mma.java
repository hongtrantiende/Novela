package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mma  reason: default package */
/* loaded from: classes.dex */
public final class mma extends aac {
    public static final Object n = new Object();
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Object k;
    public final f57 l;
    public final b57 m;

    static {
        fr2 fr2Var = new fr2();
        ms5 ms5Var = qs5.b;
        mm9 mm9Var = mm9.e;
        List list = Collections.EMPTY_LIST;
        mm9 mm9Var2 = mm9.e;
        a57 a57Var = new a57();
        d57 d57Var = d57.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new c57(uri, null, null, list, mm9Var2, -9223372036854775807L);
        }
        fr2Var.a();
        a57Var.a();
        j57 j57Var = j57.B;
    }

    public mma(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, kh5 kh5Var, f57 f57Var, b57 b57Var) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = kh5Var;
        f57Var.getClass();
        this.l = f57Var;
        this.m = b57Var;
    }

    @Override // defpackage.aac
    public final int b(Object obj) {
        if (n != obj) {
            return -1;
        }
        return 0;
    }

    @Override // defpackage.aac
    public final y9c f(int i, y9c y9cVar, boolean z) {
        Object obj;
        wq9.w(i, 1);
        if (z) {
            obj = n;
        } else {
            obj = null;
        }
        Object obj2 = obj;
        y9cVar.getClass();
        c7 c7Var = c7.c;
        y9cVar.h(null, obj2, 0, this.d, -this.f, c7Var, false);
        return y9cVar;
    }

    @Override // defpackage.aac
    public final int h() {
        return 1;
    }

    @Override // defpackage.aac
    public final Object l(int i) {
        wq9.w(i, 1);
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1 > r3) goto L9;
     */
    @Override // defpackage.aac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.z9c m(int r23, defpackage.z9c r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r1 = 1
            r2 = r23
            defpackage.wq9.w(r2, r1)
            long r1 = r0.g
            boolean r13 = r0.i
            if (r13 == 0) goto L2c
            boolean r3 = r0.j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r25 > r3 ? 1 : (r25 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
        L23:
            r15 = r5
            goto L2d
        L25:
            long r1 = r1 + r25
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
            goto L23
        L2c:
            r15 = r1
        L2d:
            java.lang.Object r1 = defpackage.z9c.p
            r19 = 0
            long r1 = r0.f
            f57 r4 = r0.l
            java.lang.Object r5 = r0.k
            long r6 = r0.b
            long r8 = r0.c
            boolean r12 = r0.h
            b57 r14 = r0.m
            long r10 = r0.e
            r3 = r24
            r20 = r1
            r17 = r10
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.b(r4, r5, r6, r8, r10, r12, r13, r14, r15, r17, r19, r20)
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mma.m(int, z9c, long):z9c");
    }

    @Override // defpackage.aac
    public final int o() {
        return 1;
    }
}
