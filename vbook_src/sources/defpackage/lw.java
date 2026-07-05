package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lw  reason: default package */
/* loaded from: classes.dex */
public abstract class lw extends TextView {
    public Future C;
    public final t6f a;
    public final hw b;
    public final kw5 c;
    public aw d;
    public boolean e;
    public uwd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object obj = nac.a;
        if (!(context.getResources() instanceof oac)) {
            context.getResources();
            int i2 = i4d.a;
        }
        this.e = false;
        this.f = null;
        y6c.a(this, getContext());
        t6f t6fVar = new t6f(this);
        this.a = t6fVar;
        t6fVar.d(attributeSet, i);
        hw hwVar = new hw(this);
        this.b = hwVar;
        hwVar.d(attributeSet, i);
        hwVar.b();
        kw5 kw5Var = new kw5(5);
        kw5Var.b = this;
        this.c = kw5Var;
        aw emojiTextViewHelper = getEmojiTextViewHelper();
        TypedArray obtainStyledAttributes = emojiTextViewHelper.a.getContext().obtainStyledAttributes(attributeSet, gg9.b, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            ((hxe) emojiTextViewHelper.b.a).x(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private aw getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new aw(this);
        }
        return this.d;
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
    public int getAutoSizeMaxTextSize() {
        if (ded.a) {
            return super.getAutoSizeMaxTextSize();
        }
        hw hwVar = this.b;
        if (hwVar != null) {
            return Math.round(hwVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (ded.a) {
            return super.getAutoSizeMinTextSize();
        }
        hw hwVar = this.b;
        if (hwVar != null) {
            return Math.round(hwVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (ded.a) {
            return super.getAutoSizeStepGranularity();
        }
        hw hwVar = this.b;
        if (hwVar != null) {
            return Math.round(hwVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (ded.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        hw hwVar = this.b;
        if (hwVar != null) {
            return hwVar.i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (ded.a) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        hw hwVar = this.b;
        if (hwVar != null) {
            return hwVar.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        if ((customSelectionActionModeCallback instanceof g4c) && Build.VERSION.SDK_INT >= 26) {
            return ((g4c) customSelectionActionModeCallback).a;
        }
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public iw getSuperCaller() {
        if (this.f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f = new kw(this);
            } else if (i >= 28) {
                this.f = new jw(this);
            } else if (i >= 26) {
                this.f = new uwd(this, 4);
            }
        }
        return this.f;
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

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.C;
        if (future != null) {
            try {
                this.C = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    yz1.l(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        kw5 kw5Var;
        if (Build.VERSION.SDK_INT < 28 && (kw5Var = this.c) != null) {
            TextClassifier textClassifier = (TextClassifier) kw5Var.c;
            if (textClassifier == null) {
                return bw.a((lw) kw5Var.b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public c39 getTextMetricsParamsCompat() {
        return yz1.l(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            po3.c(editorInfo, getText());
        }
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        hw hwVar = this.b;
        if (hwVar != null && !ded.a) {
            hwVar.i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.C;
        if (future != null) {
            try {
                this.C = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    yz1.l(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        hw hwVar = this.b;
        if (hwVar != null && !ded.a) {
            qw qwVar = hwVar.i;
            if (qwVar.a != 0) {
                qwVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((hxe) getEmojiTextViewHelper().b.a).w(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (ded.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        hw hwVar = this.b;
        if (hwVar != null) {
            qw qwVar = hwVar.i;
            DisplayMetrics displayMetrics = qwVar.j.getResources().getDisplayMetrics();
            qwVar.i(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (qwVar.g()) {
                qwVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (ded.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        hw hwVar = this.b;
        if (hwVar != null) {
            qw qwVar = hwVar.i;
            qwVar.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = qwVar.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                qwVar.f = qw.b(iArr2);
                if (!qwVar.h()) {
                    fb4.m(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                qwVar.g = false;
            }
            if (qwVar.g()) {
                qwVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (ded.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        hw hwVar = this.b;
        if (hwVar != null) {
            qw qwVar = hwVar.i;
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = qwVar.j.getResources().getDisplayMetrics();
                    qwVar.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (qwVar.g()) {
                        qwVar.a();
                        return;
                    }
                    return;
                }
                qwVar.getClass();
                vs.m(a82.j(i, "Unknown auto-size text type: "));
                return;
            }
            qwVar.a = 0;
            qwVar.d = -1.0f;
            qwVar.e = -1.0f;
            qwVar.c = -1.0f;
            qwVar.f = new int[0];
            qwVar.b = false;
        }
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = iue.P(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = iue.P(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = iue.P(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = iue.P(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        hw hwVar = this.b;
        if (hwVar != null) {
            hwVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = iue.P(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = iue.P(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = iue.P(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = iue.P(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
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

    public void setEmojiCompatEnabled(boolean z) {
        ((hxe) getEmojiTextViewHelper().b.a).x(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((hxe) getEmojiTextViewHelper().b.a).l(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i);
        } else {
            yz1.u(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            yz1.v(this, i);
        }
    }

    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().k(i, f);
        } else if (i2 >= 34) {
            k4.E(this, i, f);
        } else {
            yz1.w(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(d39 d39Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        yz1.l(this);
        throw null;
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        kw5 kw5Var;
        if (Build.VERSION.SDK_INT < 28 && (kw5Var = this.c) != null) {
            kw5Var.c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<d39> future) {
        this.C = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c39 c39Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c39Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c39Var.a);
        setBreakStrategy(c39Var.c);
        setHyphenationFrequency(c39Var.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = ded.a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        hw hwVar = this.b;
        if (hwVar != null) {
            qw qwVar = hwVar.i;
            if (z || qwVar.a != 0) {
                return;
            }
            qwVar.f(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.e) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            fbe fbeVar = qsc.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                vs.m("Context cannot be null");
                return;
            }
        } else {
            typeface2 = null;
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        yz1.w(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        hw hwVar = this.b;
        if (hwVar != null) {
            hwVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        hw hwVar = this.b;
        if (hwVar != null) {
            hwVar.b();
        }
    }

    public lw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }
}
