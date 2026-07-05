package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.reader.android.MainActivity;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qwa  reason: default package */
/* loaded from: classes.dex */
public final class qwa extends rwa {
    public owa d;
    public final pwa e;

    public qwa(MainActivity mainActivity) {
        super(mainActivity);
        this.e = new pwa(this, mainActivity);
    }

    @Override // defpackage.rwa
    public final void m() {
        int i;
        MainActivity mainActivity = (MainActivity) this.b;
        Resources.Theme theme = mainActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.e);
        }
    }

    @Override // defpackage.rwa
    public final void q(d89 d89Var) {
        this.c = d89Var;
        View findViewById = ((MainActivity) this.b).findViewById(16908290);
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (this.d != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.d);
        }
        owa owaVar = new owa(this, findViewById, 1);
        this.d = owaVar;
        viewTreeObserver.addOnPreDrawListener(owaVar);
    }
}
