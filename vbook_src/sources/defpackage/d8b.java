package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d8b  reason: default package */
/* loaded from: classes.dex */
public final class d8b implements r94 {
    public final o8b a;
    public final vq4 b;
    public final ArrayList c;
    public fjc f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = a2d.b;
    public final km8 d = new km8();

    public d8b(o8b o8bVar, vq4 vq4Var) {
        vq4 vq4Var2;
        this.a = o8bVar;
        if (vq4Var != null) {
            uq4 a = vq4Var.a();
            a.n = lc7.p("application/x-media3-cues");
            a.j = vq4Var.o;
            a.L = o8bVar.m();
            vq4Var2 = new vq4(a);
        } else {
            vq4Var2 = null;
        }
        this.b = vq4Var2;
        this.c = new ArrayList();
        this.h = 0;
        this.i = a2d.c;
        this.j = -9223372036854775807L;
    }

    @Override // defpackage.r94
    public final void a() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (r20.g != r14) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r2 == (-1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
        r4 = r20.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0082, code lost:
        if (r4 == (-9223372036854775807L)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
        r2 = new defpackage.n8b(true, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
        r2 = defpackage.n8b.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
        r20.a.k(r20.e, 0, r20.g, r2, new defpackage.d89(r20, 7));
        java.util.Collections.sort(r11);
        r20.i = new long[r11.size()];
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b5, code lost:
        if (r2 >= r11.size()) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r20.i[r2] = ((defpackage.c8b) r11.get(r2)).a;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
        r20.e = defpackage.a2d.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
        r20.h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
        throw defpackage.xm8.a(r0, "SubtitleParser failed.");
     */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.s94 r21, defpackage.fr2 r22) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d8b.b(s94, fr2):int");
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        return true;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        boolean z;
        int i = this.h;
        if (i != 0 && i != 5) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        this.j = j2;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        boolean z;
        if (this.h == 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        fjc s = t94Var.s(0, 3);
        this.f = s;
        vq4 vq4Var = this.b;
        if (vq4Var != null) {
            s.g(vq4Var);
            t94Var.m();
            t94Var.v(new yt5(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    public final void g(c8b c8bVar) {
        this.f.getClass();
        byte[] bArr = c8bVar.b;
        int length = bArr.length;
        km8 km8Var = this.d;
        km8Var.getClass();
        km8Var.K(bArr, bArr.length);
        this.f.e(length, km8Var);
        this.f.a(c8bVar.a, 1, length, 0, null);
    }
}
