package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yw8  reason: default package */
/* loaded from: classes.dex */
public final class yw8 {
    public final Context a;
    public AutofillManager b;

    public yw8(Context context) {
        this.a = context;
    }

    public final void a() {
        b().commit();
    }

    public final AutofillManager b() {
        AutofillManager autofillManager = this.b;
        if (autofillManager == null) {
            AutofillManager autofillManager2 = (AutofillManager) this.a.getSystemService(AutofillManager.class);
            if (autofillManager2 != null) {
                this.b = autofillManager2;
                return autofillManager2;
            }
            vs.k("Could not locate AutofillManager from context");
            return null;
        }
        return autofillManager;
    }

    public final void c(rg rgVar, int i, AutofillValue autofillValue) {
        b().notifyValueChanged(rgVar, i, autofillValue);
    }

    public final void d(rg rgVar, int i, Rect rect) {
        b().notifyViewEntered(rgVar, i, rect);
    }

    public final void e(rg rgVar, int i) {
        b().notifyViewExited(rgVar, i);
    }

    public final void f(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            wd0.a(view, b(), i, z);
        }
    }

    public final void g(rg rgVar, int i, Rect rect) {
        b().requestAutofill(rgVar, i, rect);
    }
}
