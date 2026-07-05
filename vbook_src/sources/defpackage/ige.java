package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ige  reason: default package */
/* loaded from: classes.dex */
public final class ige implements b0f {
    public final /* synthetic */ qke a;

    public ige(qke qkeVar) {
        this.a = qkeVar;
    }

    @Override // defpackage.b0f
    public final void b(String str, String str2, Bundle bundle) {
        qke qkeVar = this.a;
        qkeVar.a(new khe(qkeVar, str, str2, bundle, 1));
    }

    @Override // defpackage.b0f
    public final void c(Bundle bundle) {
        qke qkeVar = this.a;
        qkeVar.a(new fhe(qkeVar, bundle, 1));
    }

    @Override // defpackage.b0f
    public final void d(String str) {
        qke qkeVar = this.a;
        qkeVar.a(new qhe(qkeVar, str, 2));
    }

    @Override // defpackage.b0f
    public final void e(String str) {
        qke qkeVar = this.a;
        qkeVar.a(new qhe(qkeVar, str, 1));
    }

    @Override // defpackage.b0f
    public final void f(String str, String str2, Bundle bundle) {
        qke qkeVar = this.a;
        qkeVar.a(new khe(qkeVar, str, str2, bundle, 0));
    }

    @Override // defpackage.b0f
    public final List g(String str, String str2) {
        ree reeVar = new ree();
        qke qkeVar = this.a;
        qkeVar.a(new ohe(qkeVar, str, str2, reeVar));
        List list = (List) ree.f(reeVar.e(5000L), List.class);
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    @Override // defpackage.b0f
    public final int h(String str) {
        ree reeVar = new ree();
        qke qkeVar = this.a;
        qkeVar.a(new cie(qkeVar, str, reeVar, 1));
        Integer num = (Integer) ree.f(reeVar.e(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.b0f
    public final Map i(String str, String str2, boolean z) {
        ree reeVar = new ree();
        qke qkeVar = this.a;
        qkeVar.a(new vie(qkeVar, str, str2, z, reeVar));
        Bundle e = reeVar.e(5000L);
        if (e != null && e.size() != 0) {
            HashMap hashMap = new HashMap(e.size());
            for (String str3 : e.keySet()) {
                Object obj = e.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.EMPTY_MAP;
    }

    @Override // defpackage.b0f
    public final String zzh() {
        ree reeVar = new ree();
        qke qkeVar = this.a;
        qkeVar.a(new mie(qkeVar, reeVar, 3, false));
        return (String) ree.f(reeVar.e(500L), String.class);
    }

    @Override // defpackage.b0f
    public final String zzi() {
        ree reeVar = new ree();
        qke qkeVar = this.a;
        qkeVar.a(new mie(qkeVar, reeVar, 4, false));
        return (String) ree.f(reeVar.e(500L), String.class);
    }

    @Override // defpackage.b0f
    public final String zzj() {
        ree reeVar = new ree();
        qke qkeVar = this.a;
        qkeVar.a(new mie(qkeVar, reeVar, 1));
        return (String) ree.f(reeVar.e(50L), String.class);
    }

    @Override // defpackage.b0f
    public final String zzk() {
        ree reeVar = new ree();
        qke qkeVar = this.a;
        qkeVar.a(new mie(qkeVar, reeVar, 0));
        return (String) ree.f(reeVar.e(500L), String.class);
    }

    @Override // defpackage.b0f
    public final long zzl() {
        return this.a.d();
    }
}
