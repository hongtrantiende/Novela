package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: udd  reason: default package */
/* loaded from: classes.dex */
public final class udd implements sdd, y35, ty9 {
    public final /* synthetic */ s26 a;
    public final /* synthetic */ qdd b;
    public final /* synthetic */ xn6 c;
    public final /* synthetic */ ldd d;
    public final /* synthetic */ pb2 e;
    public final /* synthetic */ Bundle f;

    public udd(s26 s26Var, qdd qddVar, xn6 xn6Var, ldd lddVar, pb2 pb2Var, Bundle bundle) {
        this.a = s26Var;
        this.b = qddVar;
        this.c = xn6Var;
        this.d = lddVar;
        this.e = pb2Var;
        this.f = bundle;
        if (s26Var.y("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            ny9.b(this);
        }
    }

    @Override // defpackage.y35
    public final ldd e() {
        return this.d;
    }

    @Override // defpackage.y35
    public final ru7 f() {
        ru7 ru7Var = new ru7(this.e);
        Bundle v = jsc.v((yk8[]) Arrays.copyOf(new yk8[0], 0));
        LinkedHashMap linkedHashMap = ru7Var.a;
        u28 u28Var = ny9.c;
        Bundle bundle = (Bundle) linkedHashMap.get(u28Var);
        if (bundle != null) {
            v.putAll(bundle);
        }
        Bundle bundle2 = this.f;
        bundle2.getClass();
        v.putAll(bundle2);
        linkedHashMap.put(u28Var, v);
        linkedHashMap.put(ny9.a, this);
        linkedHashMap.put(ny9.b, this);
        return ru7Var;
    }

    @Override // defpackage.sdd
    public final qdd i() {
        return this.b;
    }

    @Override // defpackage.ty9
    public final s26 j() {
        return this.a;
    }

    @Override // defpackage.un6
    public final xn6 k() {
        return this.c;
    }
}
