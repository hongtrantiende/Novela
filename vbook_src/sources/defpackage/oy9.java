package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oy9  reason: default package */
/* loaded from: classes.dex */
public final class oy9 implements ry9 {
    public final s26 a;
    public boolean b;
    public Bundle c;
    public final mfb d;

    public oy9(s26 s26Var, sdd sddVar) {
        s26Var.getClass();
        this.a = s26Var;
        this.d = new mfb(new ak9(sddVar, 8));
    }

    @Override // defpackage.ry9
    public final Bundle a() {
        Bundle v = jsc.v((yk8[]) Arrays.copyOf(new yk8[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            v.putAll(bundle);
        }
        for (Map.Entry entry : ((py9) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((ut1) ((ky9) entry.getValue()).a.f).a();
            if (!a.isEmpty()) {
                str.getClass();
                v.putBundle(str, a);
            }
        }
        this.b = false;
        return v;
    }

    public final void b() {
        if (!this.b) {
            Bundle q = this.a.q("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle v = jsc.v((yk8[]) Arrays.copyOf(new yk8[0], 0));
            Bundle bundle = this.c;
            if (bundle != null) {
                v.putAll(bundle);
            }
            if (q != null) {
                v.putAll(q);
            }
            this.c = v;
            this.b = true;
            py9 py9Var = (py9) this.d.getValue();
        }
    }
}
