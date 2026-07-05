package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jq2  reason: default package */
/* loaded from: classes.dex */
public final class jq2 {
    public Integer a;

    public final Integer a(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        Integer num = null;
        if ((Integer.MIN_VALUE & unicodeChar) != 0) {
            this.a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
            return null;
        }
        Integer num2 = this.a;
        if (num2 != null) {
            this.a = null;
            Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), unicodeChar));
            if (valueOf.intValue() != 0) {
                num = valueOf;
            }
            if (num != null) {
                unicodeChar = num.intValue();
            }
            return Integer.valueOf(unicodeChar);
        }
        return Integer.valueOf(unicodeChar);
    }
}
