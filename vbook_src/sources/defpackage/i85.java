package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i85  reason: default package */
/* loaded from: classes.dex */
public final class i85 implements rb7 {
    public final String a;
    public final String b;
    public final List c;

    public i85(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i85.class == obj.getClass()) {
            i85 i85Var = (i85) obj;
            if (TextUtils.equals(this.a, i85Var.a) && TextUtils.equals(this.b, i85Var.b) && this.c.equals(i85Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        String str = this.a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.c.hashCode() + ((i3 + i2) * 31);
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        if (str2 != null) {
            str = s21.q(a82.o(" [", str2, ", "), this.b, "]");
        } else {
            str = "";
        }
        return "HlsTrackMetadataEntry".concat(str);
    }
}
