package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fl9  reason: default package */
/* loaded from: classes.dex */
public class fl9 extends ViewGroup.MarginLayoutParams {
    public rl9 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public fl9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public fl9(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public fl9(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public fl9(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public fl9(fl9 fl9Var) {
        super((ViewGroup.LayoutParams) fl9Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
