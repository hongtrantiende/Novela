package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ot1 b = pt1.b(dne.class);
        b.a(x13.b(Context.class));
        b.a(new x13(2, 0, zvd.class));
        b.f = abf.N;
        pt1 b2 = b.b();
        ot1 b3 = pt1.b(pb6.class);
        b3.a(x13.b(dne.class));
        b3.a(x13.b(wy3.class));
        b3.f = kh5.b0;
        Object[] objArr = {b2, b3.b()};
        for (int i = 0; i < 2; i++) {
            n9f n9fVar = ocf.b;
            if (objArr[i] == null) {
                xk5.k(a82.j(i, "at index "));
                return null;
            }
        }
        return ocf.f(2, objArr);
    }
}
