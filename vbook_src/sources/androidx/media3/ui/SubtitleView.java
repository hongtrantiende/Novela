package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public int C;
    public r8b D;
    public View E;
    public List a;
    public r61 b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.EMPTY_LIST;
        this.b = r61.g;
        this.c = 0.0533f;
        this.d = 0.08f;
        this.e = true;
        this.f = true;
        q61 q61Var = new q61(context, 0);
        this.D = q61Var;
        this.E = q61Var;
        addView(q61Var);
        this.C = 1;
    }

    private List<td2> getCuesWithStylingPreferencesApplied() {
        Object[] spans;
        if (this.e && this.f) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            sd2 a = ((td2) this.a.get(i)).a();
            if (!this.e) {
                a.n = false;
                CharSequence charSequence = a.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a.a = SpannableString.valueOf(charSequence);
                        a.b = null;
                    }
                    CharSequence charSequence2 = a.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof mb6)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                hse.m(a);
            } else if (!this.f) {
                hse.m(a);
            }
            arrayList.add(a.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private r61 getUserCaptionStyle() {
        int i;
        int i2;
        int i3;
        boolean isInEditMode = isInEditMode();
        r61 r61Var = r61.g;
        if (isInEditMode) {
            return r61Var;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            int i4 = -1;
            if (userStyle.hasForegroundColor()) {
                i = userStyle.foregroundColor;
            } else {
                i = -1;
            }
            if (userStyle.hasBackgroundColor()) {
                i2 = userStyle.backgroundColor;
            } else {
                i2 = -16777216;
            }
            int i5 = 0;
            if (userStyle.hasWindowColor()) {
                i3 = userStyle.windowColor;
            } else {
                i3 = 0;
            }
            if (userStyle.hasEdgeType()) {
                i5 = userStyle.edgeType;
            }
            if (userStyle.hasEdgeColor()) {
                i4 = userStyle.edgeColor;
            }
            return new r61(i, i2, i3, i5, i4, userStyle.getTypeface());
        }
        return r61Var;
    }

    private <T extends View & r8b> void setView(T t) {
        removeView(this.E);
        View view = this.E;
        if (view instanceof ohd) {
            ((ohd) view).b.destroy();
        }
        this.E = t;
        this.D = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.D.a(getCuesWithStylingPreferencesApplied(), this.b, this.c, this.d);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.e = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.d = f;
        c();
    }

    public void setCues(List<td2> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.a = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.c = f;
        c();
    }

    public void setStyle(r61 r61Var) {
        this.b = r61Var;
        c();
    }

    public void setViewType(int i) {
        if (this.C == i) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                setView(new ohd(getContext()));
            } else {
                p1a.g();
                return;
            }
        } else {
            setView(new q61(getContext(), 0));
        }
        this.C = i;
    }

    public SubtitleView(Context context) {
        this(context, null);
    }
}
