package defpackage;

import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ys3  reason: default package */
/* loaded from: classes3.dex */
public final class ys3 extends aab implements lu4 {
    public short C;
    public byte D;
    public byte E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ s11 J;
    public ByteBuffer a;
    public ByteBuffer b;
    public Inflater c;
    public CRC32 d;
    public xl9 e;
    public xl9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys3(boolean z, s11 s11Var, m42 m42Var) {
        super(2, m42Var);
        this.I = z;
        this.J = s11Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        ys3 ys3Var = new ys3(this.I, this.J, m42Var);
        ys3Var.H = obj;
        return ys3Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((ys3) create((bod) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00df, code lost:
        if (r2 == r8) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0194, code lost:
        if (defpackage.v9e.u(r7, 2, r18) == r8) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01de A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x0026, B:92:0x0291, B:86:0x026c, B:88:0x0272, B:94:0x02aa, B:96:0x02b2, B:98:0x02d2, B:101:0x02d7, B:102:0x02fb, B:103:0x02fc, B:104:0x0303, B:105:0x0304, B:106:0x0327, B:107:0x0328, B:111:0x033c, B:112:0x0343, B:72:0x0211, B:74:0x0217, B:76:0x021d, B:82:0x025d, B:64:0x01d8, B:66:0x01de, B:69:0x01f7, B:71:0x01ff, B:83:0x0262, B:85:0x0268, B:113:0x0344, B:17:0x0055, B:63:0x01d1), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ff A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x0026, B:92:0x0291, B:86:0x026c, B:88:0x0272, B:94:0x02aa, B:96:0x02b2, B:98:0x02d2, B:101:0x02d7, B:102:0x02fb, B:103:0x02fc, B:104:0x0303, B:105:0x0304, B:106:0x0327, B:107:0x0328, B:111:0x033c, B:112:0x0343, B:72:0x0211, B:74:0x0217, B:76:0x021d, B:82:0x025d, B:64:0x01d8, B:66:0x01de, B:69:0x01f7, B:71:0x01ff, B:83:0x0262, B:85:0x0268, B:113:0x0344, B:17:0x0055, B:63:0x01d1), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217 A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x0026, B:92:0x0291, B:86:0x026c, B:88:0x0272, B:94:0x02aa, B:96:0x02b2, B:98:0x02d2, B:101:0x02d7, B:102:0x02fb, B:103:0x02fc, B:104:0x0303, B:105:0x0304, B:106:0x0327, B:107:0x0328, B:111:0x033c, B:112:0x0343, B:72:0x0211, B:74:0x0217, B:76:0x021d, B:82:0x025d, B:64:0x01d8, B:66:0x01de, B:69:0x01f7, B:71:0x01ff, B:83:0x0262, B:85:0x0268, B:113:0x0344, B:17:0x0055, B:63:0x01d1), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0262 A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x0026, B:92:0x0291, B:86:0x026c, B:88:0x0272, B:94:0x02aa, B:96:0x02b2, B:98:0x02d2, B:101:0x02d7, B:102:0x02fb, B:103:0x02fc, B:104:0x0303, B:105:0x0304, B:106:0x0327, B:107:0x0328, B:111:0x033c, B:112:0x0343, B:72:0x0211, B:74:0x0217, B:76:0x021d, B:82:0x025d, B:64:0x01d8, B:66:0x01de, B:69:0x01f7, B:71:0x01ff, B:83:0x0262, B:85:0x0268, B:113:0x0344, B:17:0x0055, B:63:0x01d1), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0272 A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:7:0x0026, B:92:0x0291, B:86:0x026c, B:88:0x0272, B:94:0x02aa, B:96:0x02b2, B:98:0x02d2, B:101:0x02d7, B:102:0x02fb, B:103:0x02fc, B:104:0x0303, B:105:0x0304, B:106:0x0327, B:107:0x0328, B:111:0x033c, B:112:0x0343, B:72:0x0211, B:74:0x0217, B:76:0x021d, B:82:0x025d, B:64:0x01d8, B:66:0x01de, B:69:0x01f7, B:71:0x01ff, B:83:0x0262, B:85:0x0268, B:113:0x0344, B:17:0x0055, B:63:0x01d1), top: B:122:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01fd -> B:64:0x01d8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01ff -> B:72:0x0211). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x023b -> B:80:0x0242). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0290 -> B:92:0x0291). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
