package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        pt1 pt1Var = uga.b;
        ot1 b = pt1.b(hq7.class);
        b.a(x13.b(uc7.class));
        b.f = new tw8(8);
        pt1 b2 = b.b();
        ot1 b3 = pt1.b(wc7.class);
        b3.f = new bl8(10);
        pt1 b4 = b3.b();
        ot1 b5 = pt1.b(kn9.class);
        b5.a(new x13(2, 0, jn9.class));
        b5.f = new d38(12);
        pt1 b6 = b5.b();
        ot1 b7 = pt1.b(wy3.class);
        b7.a(new x13(1, 1, wc7.class));
        b7.f = new pq8(14);
        pt1 b8 = b7.b();
        ot1 b9 = pt1.b(pi1.class);
        b9.f = new jf8(17);
        pt1 b10 = b9.b();
        ot1 b11 = pt1.b(zj1.class);
        b11.a(x13.b(pi1.class));
        b11.f = new iv8(19);
        pt1 b12 = b11.b();
        ot1 b13 = pt1.b(cne.class);
        b13.a(x13.b(uc7.class));
        b13.f = new pq8(22);
        pt1 b14 = b13.b();
        ot1 b15 = pt1.b(jn9.class);
        b15.e = 1;
        b15.a(new x13(1, 1, cne.class));
        b15.f = new iv8(23);
        Object[] objArr = {pt1Var, b2, b4, b6, b8, b10, b12, b14, b15.b()};
        for (int i = 0; i < 9; i++) {
            b0e b0eVar = w1e.C;
            if (objArr[i] == null) {
                xk5.k(a82.j(i, "at index "));
                return null;
            }
        }
        b0e b0eVar2 = w1e.C;
        return new r7e(objArr, 9);
    }
}
