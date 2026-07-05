package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tdd  reason: default package */
/* loaded from: classes.dex */
public final class tdd implements sdd, y35 {
    public final /* synthetic */ qdd a;
    public final /* synthetic */ ldd b;
    public final /* synthetic */ pb2 c;
    public final /* synthetic */ Bundle d;

    public tdd(qdd qddVar, ldd lddVar, pb2 pb2Var, Bundle bundle) {
        this.a = qddVar;
        this.b = lddVar;
        this.c = pb2Var;
        this.d = bundle;
    }

    @Override // defpackage.y35
    public final ldd e() {
        return this.b;
    }

    @Override // defpackage.y35
    public final ru7 f() {
        ru7 ru7Var = new ru7(this.c);
        Bundle v = jsc.v((yk8[]) Arrays.copyOf(new yk8[0], 0));
        LinkedHashMap linkedHashMap = ru7Var.a;
        u28 u28Var = ny9.c;
        Bundle bundle = (Bundle) linkedHashMap.get(u28Var);
        if (bundle != null) {
            v.putAll(bundle);
        }
        Bundle bundle2 = this.d;
        bundle2.getClass();
        v.putAll(bundle2);
        linkedHashMap.put(u28Var, v);
        linkedHashMap.put(ny9.b, this);
        return ru7Var;
    }

    @Override // defpackage.sdd
    public final qdd i() {
        return this.a;
    }
}
