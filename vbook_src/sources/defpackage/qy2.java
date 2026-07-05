package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qy2  reason: default package */
/* loaded from: classes.dex */
public final class qy2 {
    public final int a;
    public final List b;

    public qy2() {
        this.a = 1;
        this.b = Collections.singletonList(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.voc a(int r8, defpackage.vdf r9) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy2.a(int, vdf):voc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List b(vdf vdfVar) {
        boolean z;
        String str;
        int i;
        List list;
        boolean z2;
        boolean c = c(32);
        List list2 = this.b;
        if (c) {
            return list2;
        }
        km8 km8Var = new km8((byte[]) vdfVar.e);
        ArrayList arrayList = list2;
        while (km8Var.a() > 0) {
            int z3 = km8Var.z();
            int z4 = km8Var.b + km8Var.z();
            if (z3 == 134) {
                arrayList = new ArrayList();
                int z5 = km8Var.z() & 31;
                for (int i2 = 0; i2 < z5; i2++) {
                    String x = km8Var.x(3, StandardCharsets.UTF_8);
                    int z6 = km8Var.z();
                    if ((z6 & Token.CASE) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = z6 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte z7 = (byte) km8Var.z();
                    km8Var.N(1);
                    if (z) {
                        if ((z7 & 64) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        byte[] bArr = vk1.a;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    uq4 uq4Var = new uq4();
                    uq4Var.n = lc7.p(str);
                    uq4Var.d = x;
                    uq4Var.K = i;
                    uq4Var.q = list;
                    arrayList.add(new vq4(uq4Var));
                }
            }
            km8Var.M(z4);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public boolean c(int i) {
        if ((this.a & i) != 0) {
            return true;
        }
        return false;
    }

    public /* synthetic */ qy2(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public qy2(ArrayList arrayList) {
        this.a = 0;
        this.b = arrayList;
    }
}
