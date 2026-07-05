package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pk9  reason: default package */
/* loaded from: classes.dex */
public final class pk9 implements ry9 {
    public final LinkedHashSet a = new LinkedHashSet();

    public pk9(s26 s26Var) {
        s26Var.L("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.ry9
    public final Bundle a() {
        Bundle v = jsc.v((yk8[]) Arrays.copyOf(new yk8[0], 0));
        v.putStringArrayList("classes_to_restore", iwe.n(sl1.C0(this.a)));
        return v;
    }
}
