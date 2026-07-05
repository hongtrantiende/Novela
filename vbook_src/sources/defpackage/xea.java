package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xea  reason: default package */
/* loaded from: classes.dex */
public final class xea {
    public nc2 a = new Object();
    public nc2 b = new Object();
    public nc2 c = new Object();
    public nc2 d = new Object();
    public y72 e = new c0(nae.e);
    public y72 f = new c0(nae.e);
    public y72 g = new c0(nae.e);
    public y72 h = new c0(nae.e);
    public tn3 i = new tn3(0);
    public tn3 j = new tn3(0);
    public tn3 k = new tn3(0);
    public tn3 l = new tn3(0);

    public static xea b(Context context, AttributeSet attributeSet, int i, int i2) {
        c0 c0Var = new c0(nae.e);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fg9.e, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, resourceId2);
        }
        TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(fg9.g);
        try {
            int i3 = obtainStyledAttributes2.getInt(0, 0);
            int i4 = obtainStyledAttributes2.getInt(3, i3);
            int i5 = obtainStyledAttributes2.getInt(4, i3);
            int i6 = obtainStyledAttributes2.getInt(2, i3);
            int i7 = obtainStyledAttributes2.getInt(1, i3);
            y72 c = c(obtainStyledAttributes2, 5, c0Var);
            y72 c2 = c(obtainStyledAttributes2, 8, c);
            y72 c3 = c(obtainStyledAttributes2, 9, c);
            y72 c4 = c(obtainStyledAttributes2, 7, c);
            y72 c5 = c(obtainStyledAttributes2, 6, c);
            xea xeaVar = new xea();
            xeaVar.a = zxe.h(i4);
            xeaVar.e = c2;
            xeaVar.b = zxe.h(i5);
            xeaVar.f = c3;
            xeaVar.c = zxe.h(i6);
            xeaVar.g = c4;
            xeaVar.d = zxe.h(i7);
            xeaVar.h = c5;
            return xeaVar;
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    public static y72 c(TypedArray typedArray, int i, y72 y72Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new c0(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new vm9(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return y72Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xea, java.lang.Object] */
    public xea a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        return obj;
    }

    public boolean d(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.l.getClass().equals(tn3.class) && this.j.getClass().equals(tn3.class) && this.i.getClass().equals(tn3.class) && this.k.getClass().equals(tn3.class)) {
            z = true;
        } else {
            z = false;
        }
        float a = this.e.a(rectF);
        if (this.f.a(rectF) == a && this.h.a(rectF) == a && this.g.a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.b instanceof vu9) && (this.a instanceof vu9) && (this.c instanceof vu9) && (this.d instanceof vu9)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }
}
