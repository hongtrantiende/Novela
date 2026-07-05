package defpackage;

import java.nio.ByteBuffer;
import java.util.zip.Checksum;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sz2  reason: default package */
/* loaded from: classes3.dex */
public abstract class sz2 {
    public static final byte[] a = new byte[7];
    public static final i82 b = new i82("encoder-deflate-writer");
    public static final i82 c = new i82("encoder-deflate-reader");

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
        if (e(r20, r3) == r11) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00ac: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:38:0x00ab */
    /* JADX WARN: Removed duplicated region for block: B:107:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117 A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #2 {all -> 0x01a3, blocks: (B:86:0x01d1, B:56:0x0111, B:58:0x0117, B:79:0x01a5, B:81:0x01ab, B:93:0x01fb), top: B:100:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143 A[Catch: all -> 0x018d, TryCatch #7 {all -> 0x018d, blocks: (B:62:0x013b, B:64:0x0143, B:66:0x014f, B:73:0x0193, B:74:0x019a), top: B:108:0x013b }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a5 A[Catch: all -> 0x01a3, TRY_ENTER, TryCatch #2 {all -> 0x01a3, blocks: (B:86:0x01d1, B:56:0x0111, B:58:0x0117, B:79:0x01a5, B:81:0x01ab, B:93:0x01fb), top: B:100:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1 A[Catch: all -> 0x01a3, TRY_LEAVE, TryCatch #2 {all -> 0x01a3, blocks: (B:86:0x01d1, B:56:0x0111, B:58:0x0117, B:79:0x01a5, B:81:0x01ab, B:93:0x01fb), top: B:100:0x0111 }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x018a -> B:100:0x0111). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01a0 -> B:100:0x0111). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.s11 r19, defpackage.f31 r20, boolean r21, defpackage.k78 r22, defpackage.n42 r23) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz2.a(s11, f31, boolean, k78, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.f31 r5, java.util.zip.Deflater r6, java.nio.ByteBuffer r7, defpackage.vt4 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.oz2
            if (r0 == 0) goto L13
            r0 = r9
            oz2 r0 = (defpackage.oz2) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            oz2 r0 = new oz2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.e
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L33
            vt4 r5 = r0.d
            java.nio.ByteBuffer r6 = r0.c
            java.util.zip.Deflater r7 = r0.b
            f31 r8 = r0.a
            defpackage.hre.r(r9)
            r4 = r8
            r8 = r5
            r5 = r4
            r4 = r7
            r7 = r6
            r6 = r4
            goto L3d
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L3a:
            defpackage.hre.r(r9)
        L3d:
            java.lang.Object r9 = r8.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L85
            r7.clear()
            boolean r9 = r7.hasRemaining()
            if (r9 == 0) goto L6f
            byte[] r9 = r7.array()
            int r1 = r7.arrayOffset()
            int r3 = r7.position()
            int r3 = r3 + r1
            int r1 = r7.remaining()
            int r9 = r6.deflate(r9, r3, r1)
            int r1 = r7.position()
            int r1 = r1 + r9
            r7.position(r1)
        L6f:
            r7.flip()
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.d = r8
            r0.f = r2
            java.lang.Object r9 = defpackage.pae.q(r5, r7, r0)
            n82 r1 = defpackage.n82.a
            if (r9 != r1) goto L3d
            return r1
        L85:
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz2.b(f31, java.util.zip.Deflater, java.nio.ByteBuffer, vt4, n42):java.lang.Object");
    }

    public static s11 c(s11 s11Var, boolean z, d82 d82Var) {
        x01 x01Var = y01.a;
        s11Var.getClass();
        x01Var.getClass();
        d82Var.getClass();
        return (i11) gae.s(jz4.a, d82Var.plus(b), new pz2(0, (m42) null, s11Var, x01Var, z)).b;
    }

    public static bk1 d(f31 f31Var, boolean z, d82 d82Var) {
        x01 x01Var = y01.a;
        f31Var.getClass();
        x01Var.getClass();
        d82Var.getClass();
        d82 plus = d82Var.plus(c);
        pz2 pz2Var = new pz2(1, (m42) null, f31Var, x01Var, z);
        plus.getClass();
        i11 i11Var = new i11(false);
        iya v = z87.v(jz4.a, plus, null, new r9(pz2Var, i11Var, null, 4), 2);
        v.invokeOnCompletion(new t11(i11Var, 0));
        return new bk1(i11Var, new h21(v, null, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r9 == r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        if (r9 != r7) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.f31 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.qz2
            if (r0 == 0) goto L13
            r0 = r9
            qz2 r0 = (defpackage.qz2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qz2 r0 = new qz2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.c
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 3
            r5 = 2
            r6 = 1
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L42
            if (r1 == r6) goto L3c
            if (r1 == r5) goto L36
            if (r1 != r4) goto L30
            defpackage.hre.r(r9)
            return r3
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r2
        L36:
            f31 r8 = r0.a
            defpackage.hre.r(r9)
            goto L79
        L3c:
            f31 r8 = r0.a
            defpackage.hre.r(r9)
            goto L61
        L42:
            defpackage.hre.r(r9)
            r9 = -29921(0xffffffffffff8b1f, float:NaN)
            short r9 = java.lang.Short.reverseBytes(r9)
            r0.a = r8
            r0.c = r6
            zma r1 = r8.f()
            r1.E(r9)
            java.lang.Object r9 = defpackage.nae.m(r8, r0)
            if (r9 != r7) goto L5d
            goto L5e
        L5d:
            r9 = r3
        L5e:
            if (r9 != r7) goto L61
            goto L86
        L61:
            r0.a = r8
            r0.c = r5
            zma r9 = r8.f()
            r1 = 8
            r9.P(r1)
            java.lang.Object r9 = defpackage.nae.m(r8, r0)
            if (r9 != r7) goto L75
            goto L76
        L75:
            r9 = r3
        L76:
            if (r9 != r7) goto L79
            goto L86
        L79:
            r0.a = r2
            r0.c = r4
            r9 = 7
            byte[] r1 = defpackage.sz2.a
            java.lang.Object r8 = defpackage.gae.q(r8, r1, r9, r0)
            if (r8 != r7) goto L87
        L86:
            return r7
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz2.e(f31, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r10 == r6) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.f31 r9, java.util.zip.CRC32 r10, java.util.zip.Deflater r11, defpackage.n42 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.rz2
            if (r0 == 0) goto L13
            r0 = r12
            rz2 r0 = (defpackage.rz2) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            rz2 r0 = new rz2
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.c
            int r1 = r0.d
            pvc r2 = defpackage.pvc.a
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            defpackage.hre.r(r12)
            goto L7f
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r5
        L33:
            java.util.zip.Deflater r11 = r0.b
            f31 r9 = r0.a
            defpackage.hre.r(r12)
            goto L5f
        L3b:
            defpackage.hre.r(r12)
            long r7 = r10.getValue()
            int r10 = (int) r7
            int r10 = java.lang.Integer.reverseBytes(r10)
            r0.a = r9
            r0.b = r11
            r0.d = r4
            zma r12 = r9.f()
            r12.writeInt(r10)
            java.lang.Object r10 = defpackage.nae.m(r9, r0)
            if (r10 != r6) goto L5b
            goto L5c
        L5b:
            r10 = r2
        L5c:
            if (r10 != r6) goto L5f
            goto L7e
        L5f:
            int r10 = r11.getTotalIn()
            int r10 = java.lang.Integer.reverseBytes(r10)
            r0.a = r5
            r0.b = r5
            r0.d = r3
            zma r11 = r9.f()
            r11.writeInt(r10)
            java.lang.Object r9 = defpackage.nae.m(r9, r0)
            if (r9 != r6) goto L7b
            goto L7c
        L7b:
            r9 = r2
        L7c:
            if (r9 != r6) goto L7f
        L7e:
            return r6
        L7f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz2.f(f31, java.util.zip.CRC32, java.util.zip.Deflater, n42):java.lang.Object");
    }

    public static final void g(Checksum checksum, ByteBuffer byteBuffer) {
        checksum.getClass();
        byteBuffer.getClass();
        if (byteBuffer.hasArray()) {
            checksum.update(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
            return;
        }
        vs.m("buffer need to be array-backed");
    }
}
