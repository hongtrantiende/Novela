package defpackage;

import java.io.EOFException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q8b  reason: default package */
/* loaded from: classes.dex */
public final class q8b implements fjc {
    public final fjc a;
    public final m8b b;
    public o8b g;
    public vq4 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = a2d.b;
    public final km8 c = new km8();

    public q8b(fjc fjcVar, m8b m8bVar) {
        this.a = fjcVar;
        this.b = m8bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.fjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r5, int r7, int r8, int r9, defpackage.ejc r10) {
        /*
            r4 = this;
            o8b r0 = r4.g
            if (r0 != 0) goto La
            fjc r4 = r4.a
            r4.a(r5, r7, r8, r9, r10)
            return
        La:
            r1 = 0
            if (r10 != 0) goto Lf
            r10 = 1
            goto L10
        Lf:
            r10 = r1
        L10:
            java.lang.String r0 = "DRM on subtitles is not supported"
            defpackage.wq9.r(r0, r10)
            int r10 = r4.e
            int r10 = r10 - r9
            int r10 = r10 - r8
            r2 = r5
            o8b r5 = r4.g     // Catch: java.lang.RuntimeException -> L2e
            byte[] r6 = r4.f     // Catch: java.lang.RuntimeException -> L2e
            n8b r9 = defpackage.n8b.c     // Catch: java.lang.RuntimeException -> L2e
            r0 = r7
            r7 = r10
            ks2 r10 = new ks2     // Catch: java.lang.RuntimeException -> L2b
            r10.<init>(r4, r2, r0)     // Catch: java.lang.RuntimeException -> L2b
            r5.k(r6, r7, r8, r9, r10)     // Catch: java.lang.RuntimeException -> L2b
            goto L3c
        L2b:
            r0 = move-exception
        L2c:
            r5 = r0
            goto L31
        L2e:
            r0 = move-exception
            r7 = r10
            goto L2c
        L31:
            boolean r6 = r4.i
            if (r6 == 0) goto L49
            java.lang.String r6 = "SubtitleTranscodingTO"
            java.lang.String r9 = "Parsing subtitles failed, ignoring sample."
            defpackage.st0.x(r6, r9, r5)
        L3c:
            int r10 = r7 + r8
            r4.d = r10
            int r5 = r4.e
            if (r10 != r5) goto L48
            r4.d = r1
            r4.e = r1
        L48:
            return
        L49:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8b.a(long, int, int, int, ejc):void");
    }

    @Override // defpackage.fjc
    public final void b(km8 km8Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(km8Var, i, i2);
            return;
        }
        h(i);
        km8Var.k(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.fjc
    public final int c(eg2 eg2Var, int i, boolean z) {
        if (this.g == null) {
            return this.a.c(eg2Var, i, z);
        }
        h(i);
        int read = eg2Var.read(this.f, this.e, i);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        this.e += read;
        return read;
    }

    @Override // defpackage.fjc
    public final void g(vq4 vq4Var) {
        boolean z;
        o8b o8bVar;
        vq4Var.o.getClass();
        String str = vq4Var.o;
        if (lc7.i(str) == 3) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        boolean equals = vq4Var.equals(this.h);
        m8b m8bVar = this.b;
        if (!equals) {
            this.h = vq4Var;
            if (m8bVar.c(vq4Var)) {
                o8bVar = m8bVar.f(vq4Var);
            } else {
                o8bVar = null;
            }
            this.g = o8bVar;
        }
        o8b o8bVar2 = this.g;
        fjc fjcVar = this.a;
        if (o8bVar2 == null) {
            fjcVar.g(vq4Var);
            return;
        }
        uq4 a = vq4Var.a();
        a.n = lc7.p("application/x-media3-cues");
        a.j = str;
        a.s = Long.MAX_VALUE;
        a.L = m8bVar.h(vq4Var);
        eub.t(a, fjcVar);
    }

    public final void h(int i) {
        byte[] bArr;
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int max = Math.max(i3 * 2, i + i3);
        byte[] bArr2 = this.f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr;
    }
}
