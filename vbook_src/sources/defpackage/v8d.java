package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v8d  reason: default package */
/* loaded from: classes.dex */
public final class v8d {
    public final lh4 a;
    public final Context b;
    public s8d c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;

    /* JADX WARN: Type inference failed for: r3v1, types: [lh4, java.lang.Object] */
    public v8d(Context context) {
        this.b = context;
        ?? obj = new Object();
        obj.d = new kh4();
        obj.e = new kh4();
        obj.b = -9223372036854775807L;
        this.a = obj;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE && this.h != nae.e && surface.isValid()) {
            this.h = nae.e;
            qka.A(this.e, nae.e);
        }
    }

    public final void b() {
        this.m = 0L;
        this.q = -1L;
        this.n = -1L;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L99
            android.view.Surface r0 = r9.e
            if (r0 != 0) goto Lc
            goto L99
        Lc:
            lh4 r0 = r9.a
            java.lang.Object r2 = r0.d
            kh4 r2 = (defpackage.kh4) r2
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.d
            kh4 r2 = (defpackage.kh4) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.d
            kh4 r2 = (defpackage.kh4) r2
            long r4 = r2.e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L31
            goto L34
        L31:
            long r6 = r2.f
            long r6 = r6 / r4
        L34:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L41
        L3d:
            r2 = r3
            goto L41
        L3f:
            float r2 = r9.f
        L41:
            float r4 = r9.g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L48
            goto L99
        L48:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L8c
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L8c
            java.lang.Object r1 = r0.d
            kh4 r1 = (defpackage.kh4) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r0.d
            kh4 r1 = (defpackage.kh4) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L6b
            java.lang.Object r0 = r0.d
            kh4 r0 = (defpackage.kh4) r0
            long r0 = r0.f
            goto L70
        L6b:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L70:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L7d
            r0 = 1036831949(0x3dcccccd, float:0.1)
            goto L7f
        L7d:
            r0 = 1065353216(0x3f800000, float:1.0)
        L7f:
            float r1 = r9.g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L99
            goto L93
        L8c:
            if (r5 == 0) goto L8f
            goto L93
        L8f:
            int r0 = r0.a
            if (r0 < r1) goto L99
        L93:
            r9.g = r2
            r0 = 0
            r9.d(r0)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v8d.c():void");
    }

    public final void d(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT >= 30 && (surface = this.e) != null && this.j != Integer.MIN_VALUE && surface.isValid()) {
            if (this.d) {
                float f2 = this.g;
                if (f2 != -1.0f) {
                    f = f2 * this.i;
                    if (!z || this.h != f) {
                        this.h = f;
                        qka.A(this.e, f);
                    }
                    return;
                }
            }
            f = nae.e;
            if (!z) {
            }
            this.h = f;
            qka.A(this.e, f);
        }
    }
}
