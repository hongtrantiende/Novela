package defpackage;

import android.view.autofill.AutofillId;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bf  reason: default package */
/* loaded from: classes.dex */
public final class bf implements vd0 {
    public final rg a;
    public final be0 b;
    public final AutofillId c;

    public bf(rg rgVar, be0 be0Var) {
        AutofillId autofillId;
        this.a = rgVar;
        this.b = be0Var;
        rgVar.setImportantForAutofill(1);
        zd0 m = bue.m(rgVar);
        if (m != null) {
            autofillId = (AutofillId) m.a;
        } else {
            autofillId = null;
        }
        if (autofillId != null) {
            this.c = autofillId;
            return;
        }
        throw a82.f("Required value was null.");
    }
}
