package androidx.preference;

import android.content.res.TypedArray;
import java.util.HashSet;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiSelectListPreference(android.content.Context r3, android.util.AttributeSet r4) {
        /*
            r2 = this;
            r0 = 2130968956(0x7f04017c, float:1.754658E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = defpackage.cbe.l(r3, r0, r1)
            r2.<init>(r3, r4, r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            int[] r2 = defpackage.dg9.e
            r1 = 0
            android.content.res.TypedArray r2 = r3.obtainStyledAttributes(r4, r2, r0, r1)
            r3 = 2
            java.lang.CharSequence[] r3 = r2.getTextArray(r3)
            if (r3 != 0) goto L23
            r2.getTextArray(r1)
        L23:
            r3 = 3
            java.lang.CharSequence[] r3 = r2.getTextArray(r3)
            if (r3 != 0) goto L2e
            r3 = 1
            r2.getTextArray(r3)
        L2e:
            r2.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }
}
