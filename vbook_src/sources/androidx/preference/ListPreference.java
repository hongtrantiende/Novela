package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.vbook.android.R;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public final CharSequence[] D;
    public final String E;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dg9.d, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.D = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (zj1.I == null) {
                zj1.I = new zj1(28);
            }
            this.C = zj1.I;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, dg9.f, i, 0);
        String string = obtainStyledAttributes2.getString(33);
        this.E = string == null ? obtainStyledAttributes2.getString(7) : string;
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        u39 u39Var = this.C;
        if (u39Var != null) {
            return u39Var.g(this);
        }
        CharSequence a = super.a();
        String str = this.E;
        if (str != null) {
            String format = String.format(str, "");
            if (!TextUtils.equals(format, a)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return a;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, cbe.l(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
