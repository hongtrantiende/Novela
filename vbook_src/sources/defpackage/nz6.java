package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nz6  reason: default package */
/* loaded from: classes3.dex */
public final class nz6 {
    public final pe3 a;
    public final String[] b;

    /* JADX WARN: Multi-variable type inference failed */
    public nz6(Map map) {
        pe3 pe3Var;
        map.getClass();
        List e0 = g9a.e0(new ki4(2, new ki4(3, new ff4(sl1.V(map.entrySet()), false, new ww6(3)), new ww6(this)), new pa5(12)));
        int size = e0.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((yk8) e0.get(i)).a;
        }
        int size2 = e0.size();
        String[] strArr2 = new String[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            strArr2[i2] = ((yk8) e0.get(i2)).b;
        }
        this.b = strArr2;
        if (size == 0) {
            pe3Var = new pe3(new int[0], new int[0], 0);
        } else {
            ne3 ne3Var = new ne3(strArr);
            ne3Var.a();
            pe3Var = new pe3(ne3Var.b, ne3Var.c, size);
        }
        this.a = pe3Var;
    }
}
