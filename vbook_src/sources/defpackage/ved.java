package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ved  reason: default package */
/* loaded from: classes.dex */
public final class ved implements o8b {
    public static final wd2 e;
    public final km8 a = new km8();
    public final km8 b = new km8();
    public final ued c;
    public Inflater d;

    static {
        ms5 ms5Var = qs5.b;
        e = new wd2(-9223372036854775807L, -9223372036854775807L, mm9.e);
    }

    public ved(List list) {
        String[] split;
        int i;
        ued uedVar = new ued();
        this.c = uedVar;
        String trim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = a2d.a;
        for (String str2 : trim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] split2 = str2.substring(9).split(",", -1);
                uedVar.f = new int[split2.length];
                for (int i2 = 0; i2 < split2.length; i2++) {
                    int[] iArr = uedVar.f;
                    try {
                        i = Integer.parseInt(split2[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        st0.x("VobsubParser", "Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] split3 = str2.substring(6).trim().split("x", -1);
                if (split3.length != 2) {
                    st0.w("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + "'");
                } else {
                    try {
                        uedVar.g = Integer.parseInt(split3[0]);
                        uedVar.h = Integer.parseInt(split3[1]);
                        uedVar.d = true;
                    } catch (RuntimeException e3) {
                        st0.x("VobsubParser", "Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0281  */
    @Override // defpackage.o8b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(byte[] r26, int r27, int r28, defpackage.n8b r29, defpackage.h12 r30) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ved.k(byte[], int, int, n8b, h12):void");
    }

    @Override // defpackage.o8b
    public final int m() {
        return 2;
    }
}
