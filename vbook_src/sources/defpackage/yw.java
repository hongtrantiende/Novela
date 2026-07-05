package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yw  reason: default package */
/* loaded from: classes.dex */
public final class yw extends jsc {
    public final /* synthetic */ int h;

    public /* synthetic */ yw(int i) {
        this.h = i;
    }

    public static sx3 M(km8 km8Var) {
        String u = km8Var.u();
        u.getClass();
        String u2 = km8Var.u();
        u2.getClass();
        return new sx3(u, u2, km8Var.t(), km8Var.t(), Arrays.copyOfRange(km8Var.a, km8Var.b, km8Var.c));
    }

    @Override // defpackage.jsc
    public final tb7 B(vb7 vb7Var, ByteBuffer byteBuffer) {
        switch (this.h) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                ea1 ea1Var = new ea1(byteBuffer.array(), byteBuffer.limit());
                ea1Var.o(12);
                int d = (ea1Var.d() + ea1Var.g(12)) - 4;
                ea1Var.o(44);
                ea1Var.p(ea1Var.g(12));
                ea1Var.o(16);
                ArrayList arrayList = new ArrayList();
                while (ea1Var.d() < d) {
                    ea1Var.o(48);
                    int g = ea1Var.g(8);
                    ea1Var.o(4);
                    int d2 = ea1Var.d() + ea1Var.g(12);
                    String str = null;
                    String str2 = null;
                    while (ea1Var.d() < d2) {
                        int g2 = ea1Var.g(8);
                        int g3 = ea1Var.g(8);
                        int d3 = ea1Var.d() + g3;
                        if (g2 == 2) {
                            int g4 = ea1Var.g(16);
                            ea1Var.o(8);
                            if (g4 == 3) {
                                while (ea1Var.d() < d3) {
                                    int g5 = ea1Var.g(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[g5];
                                    ea1Var.j(bArr, g5);
                                    String str3 = new String(bArr, charset);
                                    int g6 = ea1Var.g(8);
                                    for (int i = 0; i < g6; i++) {
                                        ea1Var.p(ea1Var.g(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (g2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[g3];
                            ea1Var.j(bArr2, g3);
                            str2 = new String(bArr2, charset2);
                        }
                        ea1Var.m(d3 * 8);
                    }
                    ea1Var.m(d2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new xw(g, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new tb7(arrayList);
            default:
                return new tb7(M(new km8(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
