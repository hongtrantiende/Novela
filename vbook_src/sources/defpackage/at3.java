package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: at3  reason: default package */
/* loaded from: classes3.dex */
public abstract class at3 {
    public static final tn3 a = new tn3(24);
    public static final j55 b = new j55(24);
    public static final i82 c = new i82("encoder-inflate-writer");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.zip.Inflater r4, defpackage.f31 r5, java.nio.ByteBuffer r6, java.util.zip.CRC32 r7, defpackage.n42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.zs3
            if (r0 == 0) goto L13
            r0 = r8
            zs3 r0 = (defpackage.zs3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zs3 r0 = new zs3
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            int r4 = r0.a
            defpackage.hre.r(r8)
            goto L5f
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r8)
            r6.clear()
            byte[] r8 = r6.array()
            int r1 = r6.position()
            int r3 = r6.remaining()
            int r4 = r4.inflate(r8, r1, r3)
            int r8 = r6.position()
            int r8 = r8 + r4
            r6.position(r8)
            r6.flip()
            defpackage.sz2.g(r7, r6)
            r0.a = r4
            r0.c = r2
            java.lang.Object r5 = defpackage.pae.q(r5, r6, r0)
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L5f
            return r6
        L5f:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at3.a(java.util.zip.Inflater, f31, java.nio.ByteBuffer, java.util.zip.CRC32, n42):java.lang.Object");
    }

    public static final s11 b(s11 s11Var, boolean z, d82 d82Var) {
        return (i11) gae.t(jz4.a, d82Var.plus(c), new ys3(z, s11Var, null), 2).b;
    }
}
