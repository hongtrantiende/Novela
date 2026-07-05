package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jcd  reason: default package */
/* loaded from: classes.dex */
public final class jcd implements View.OnApplyWindowInsetsListener {
    public tjd a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ ib8 c;

    public jcd(View view, ib8 ib8Var) {
        this.b = view;
        this.c = ib8Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        tjd c = tjd.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        ib8 ib8Var = this.c;
        if (i < 30) {
            kcd.a(windowInsets, this.b);
            if (c.equals(this.a)) {
                return ib8Var.i(view, c).b();
            }
        }
        this.a = c;
        tjd i2 = ib8Var.i(view, c);
        if (i >= 30) {
            return i2.b();
        }
        Field field = rcd.a;
        view.requestApplyInsets();
        return i2.b();
    }
}
