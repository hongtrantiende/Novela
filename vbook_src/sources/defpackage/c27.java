package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c27  reason: default package */
/* loaded from: classes.dex */
public final class c27 extends Drawable.ConstantState {
    public xea a;
    public jp3 b;
    public ColorStateList c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public Rect f;
    public float g;
    public float h;
    public int i;
    public int j;
    public int k;
    public Paint.Style l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        d27 d27Var = new d27(this);
        d27Var.e = true;
        return d27Var;
    }
}
