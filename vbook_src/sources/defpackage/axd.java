package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: axd  reason: default package */
/* loaded from: classes.dex */
public final class axd extends dde {
    public final lte a;
    public final yze b;

    public axd(lte lteVar) {
        am8.s(lteVar);
        this.a = lteVar;
        yze yzeVar = lteVar.I;
        lte.l(yzeVar);
        this.b = yzeVar;
    }

    @Override // defpackage.b0f
    public final void b(String str, String str2, Bundle bundle) {
        this.b.b0(str, str2, bundle);
    }

    @Override // defpackage.b0f
    public final void c(Bundle bundle) {
        yze yzeVar = this.b;
        ((lte) yzeVar.a).G.getClass();
        yzeVar.k0(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.b0f
    public final void d(String str) {
        lte lteVar = this.a;
        gge ggeVar = lteVar.J;
        lte.j(ggeVar);
        lteVar.G.getClass();
        ggeVar.Z(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.b0f
    public final void e(String str) {
        lte lteVar = this.a;
        gge ggeVar = lteVar.J;
        lte.j(ggeVar);
        lteVar.G.getClass();
        ggeVar.Y(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.b0f
    public final void f(String str, String str2, Bundle bundle) {
        yze yzeVar = this.a.I;
        lte.l(yzeVar);
        yzeVar.l0(str, str2, bundle);
    }

    @Override // defpackage.b0f
    public final List g(String str, String str2) {
        yze yzeVar = this.b;
        lte lteVar = (lte) yzeVar.a;
        ete eteVar = lteVar.C;
        ppe ppeVar = lteVar.f;
        lte.m(eteVar);
        if (eteVar.d0()) {
            lte.m(ppeVar);
            ppeVar.f.e("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        } else if (jf8.b()) {
            lte.m(ppeVar);
            ppeVar.f.e("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            ete eteVar2 = lteVar.C;
            lte.m(eteVar2);
            eteVar2.h0(atomicReference, 5000L, "get conditional user properties", new sid(yzeVar, atomicReference, str, str2));
            List list = (List) atomicReference.get();
            if (list == null) {
                lte.m(ppeVar);
                ppeVar.f.f(null, "Timed out waiting for get conditional user properties");
                return new ArrayList();
            }
            return l6f.S0(list);
        }
    }

    @Override // defpackage.b0f
    public final int h(String str) {
        yze yzeVar = this.b;
        yzeVar.getClass();
        am8.p(str);
        ((lte) yzeVar.a).getClass();
        return 25;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Map, jla] */
    @Override // defpackage.b0f
    public final Map i(String str, String str2, boolean z) {
        yze yzeVar = this.b;
        lte lteVar = (lte) yzeVar.a;
        ete eteVar = lteVar.C;
        ppe ppeVar = lteVar.f;
        lte.m(eteVar);
        if (eteVar.d0()) {
            lte.m(ppeVar);
            ppeVar.f.e("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        } else if (jf8.b()) {
            lte.m(ppeVar);
            ppeVar.f.e("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        } else {
            AtomicReference atomicReference = new AtomicReference();
            ete eteVar2 = lteVar.C;
            lte.m(eteVar2);
            eteVar2.h0(atomicReference, 5000L, "get user properties", new gne(yzeVar, atomicReference, str, str2, z));
            List<g6f> list = (List) atomicReference.get();
            if (list == null) {
                lte.m(ppeVar);
                ppeVar.f.f(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
                return Collections.EMPTY_MAP;
            }
            ?? jlaVar = new jla(list.size());
            for (g6f g6fVar : list) {
                Object c = g6fVar.c();
                if (c != null) {
                    jlaVar.put(g6fVar.b, c);
                }
            }
            return jlaVar;
        }
    }

    @Override // defpackage.b0f
    public final String zzh() {
        b1f b1fVar = ((lte) this.b.a).H;
        lte.l(b1fVar);
        s0f s0fVar = b1fVar.c;
        if (s0fVar != null) {
            return s0fVar.a;
        }
        return null;
    }

    @Override // defpackage.b0f
    public final String zzi() {
        b1f b1fVar = ((lte) this.b.a).H;
        lte.l(b1fVar);
        s0f s0fVar = b1fVar.c;
        if (s0fVar != null) {
            return s0fVar.b;
        }
        return null;
    }

    @Override // defpackage.b0f
    public final String zzj() {
        return (String) this.b.C.get();
    }

    @Override // defpackage.b0f
    public final String zzk() {
        return this.b.m0();
    }

    @Override // defpackage.b0f
    public final long zzl() {
        l6f l6fVar = this.a.E;
        lte.k(l6fVar);
        return l6fVar.W0();
    }
}
