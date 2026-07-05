package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wv  reason: default package */
/* loaded from: classes.dex */
public abstract class wv extends AutoCompleteTextView {
    public static final int[] d = {16843126};
    public final t6f a;
    public final hw b;
    public final n07 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        Object obj = nac.a;
        if (!(context.getResources() instanceof oac)) {
            context.getResources();
            int i2 = i4d.a;
        }
        y6c.a(this, getContext());
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, d, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                drawable = iue.P(context2, resourceId);
            } else {
                drawable = obtainStyledAttributes.getDrawable(0);
            }
            setDropDownBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        t6f t6fVar = new t6f(this);
        this.a = t6fVar;
        t6fVar.d(attributeSet, i);
        hw hwVar = new hw(this);
        this.b = hwVar;
        hwVar.d(attributeSet, i);
        hwVar.b();
        n07 n07Var = new n07(this);
        this.c = n07Var;
        TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, gg9.b, i, 0);
        try {
            boolean z = obtainStyledAttributes2.hasValue(14) ? obtainStyledAttributes2.getBoolean(14, true) : true;
            obtainStyledAttributes2.recycle();
            n07Var.r(z);
            KeyListener keyListener = getKeyListener();
            if (!(keyListener instanceof NumberKeyListener)) {
                boolean isFocusable = super.isFocusable();
                boolean isClickable = super.isClickable();
                boolean isLongClickable = super.isLongClickable();
                int inputType = super.getInputType();
                KeyListener p = n07Var.p(keyListener);
                if (p != keyListener) {
                    super.setKeyListener(p);
                    super.setRawInputType(inputType);
                    super.setFocusable(isFocusable);
                    super.setClickable(isClickable);
                    super.setLongClickable(isLongClickable);
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        t6f t6fVar = this.a;
        if (t6fVar != null) {
            t6fVar.b();
        }
        hw hwVar = this.b;
        if (hwVar != null) {
            hwVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        if ((customSelectionActionModeCallback instanceof g4c) && Build.VERSION.SDK_INT >= 26) {
            return ((g4c) customSelectionActionModeCallback).a;
        }
        return customSelectionActionModeCallback;
    }

    public ColorStateList getSupportBackgroundTintList() {
        kc1 kc1Var;
        t6f t6fVar = this.a;
        if (t6fVar == null || (kc1Var = (kc1) t6fVar.f) == null) {
            return null;
        }
        return (ColorStateList) kc1Var.c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kc1 kc1Var;
        t6f t6fVar = this.a;
        if (t6fVar == null || (kc1Var = (kc1) t6fVar.f) == null) {
            return null;
        }
        return (PorterDuff.Mode) kc1Var.d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        kc1 kc1Var = this.b.h;
        if (kc1Var != null) {
            return (ColorStateList) kc1Var.c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        kc1 kc1Var = this.b.h;
        if (kc1Var != null) {
            return (PorterDuff.Mode) kc1Var.d;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        mce mceVar = (mce) this.c.b;
        if (onCreateInputConnection == null) {
            mceVar.getClass();
            return null;
        }
        kw5 kw5Var = (kw5) mceVar.a;
        kw5Var.getClass();
        if (onCreateInputConnection instanceof iq3) {
            return onCreateInputConnection;
        }
        return new iq3((wv) kw5Var.b, onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        t6f t6fVar = this.a;
        if (t6fVar != null) {
            t6fVar.b = -1;
            t6fVar.l(null);
            t6fVar.b();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        ColorStateList colorStateList;
        super.setBackgroundResource(i);
        t6f t6fVar = this.a;
        if (t6fVar != null) {
            t6fVar.b = i;
            zv zvVar = (zv) t6fVar.d;
            if (zvVar != null) {
                Context context = ((TextView) t6fVar.c).getContext();
                synchronized (zvVar) {
                    colorStateList = zvVar.a.g(context, i);
                }
            } else {
                colorStateList = null;
            }
            t6fVar.l(colorStateList);
            t6fVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        hw hwVar = this.b;
        if (hwVar != null) {
            hwVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        hw hwVar = this.b;
        if (hwVar != null) {
            hwVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof g4c) && callback != null) {
            callback = new g4c(callback, this);
        }
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(iue.P(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.r(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.p(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        t6f t6fVar = this.a;
        if (t6fVar != null) {
            if (((kc1) t6fVar.f) == null) {
                t6fVar.f = new Object();
            }
            kc1 kc1Var = (kc1) t6fVar.f;
            kc1Var.c = colorStateList;
            kc1Var.b = true;
            t6fVar.b();
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        t6f t6fVar = this.a;
        if (t6fVar != null) {
            if (((kc1) t6fVar.f) == null) {
                t6fVar.f = new Object();
            }
            kc1 kc1Var = (kc1) t6fVar.f;
            kc1Var.d = mode;
            kc1Var.a = true;
            t6fVar.b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kc1, java.lang.Object] */
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z;
        hw hwVar = this.b;
        if (hwVar.h == null) {
            hwVar.h = new Object();
        }
        kc1 kc1Var = hwVar.h;
        kc1Var.c = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        kc1Var.b = z;
        hwVar.b = kc1Var;
        hwVar.c = kc1Var;
        hwVar.d = kc1Var;
        hwVar.e = kc1Var;
        hwVar.f = kc1Var;
        hwVar.g = kc1Var;
        hwVar.b();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kc1, java.lang.Object] */
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        boolean z;
        hw hwVar = this.b;
        if (hwVar.h == null) {
            hwVar.h = new Object();
        }
        kc1 kc1Var = hwVar.h;
        kc1Var.d = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        kc1Var.a = z;
        hwVar.b = kc1Var;
        hwVar.c = kc1Var;
        hwVar.d = kc1Var;
        hwVar.e = kc1Var;
        hwVar.f = kc1Var;
        hwVar.g = kc1Var;
        hwVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        hw hwVar = this.b;
        if (hwVar != null) {
            hwVar.e(context, i);
        }
    }
}
