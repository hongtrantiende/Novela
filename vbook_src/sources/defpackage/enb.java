package defpackage;

import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: enb  reason: default package */
/* loaded from: classes.dex */
public final class enb {
    public final CharSequence a;
    public final long b;
    public final TextClassification c;
    public final ArrayList d;

    public enb(CharSequence charSequence, long j, TextClassification textClassification, ArrayList arrayList) {
        this.a = charSequence;
        this.b = j;
        this.c = textClassification;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof enb) {
                enb enbVar = (enb) obj;
                if (!c16.i(this.a, enbVar.a) || !fxb.c(this.b, enbVar.b) || !c16.i(this.c, enbVar.c) || !this.d.equals(enbVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = fxb.c;
        int c = hl5.c(this.a.hashCode() * 31, this.b, 31);
        return this.d.hashCode() + ((this.c.hashCode() + c) * 31);
    }

    public final String toString() {
        String i = fxb.i(this.b);
        TextClassification textClassification = this.c;
        return "TextClassificationResult(text=" + ((Object) this.a) + ", selection=" + i + ", textClassification=" + textClassification + ", icons=" + this.d + ")";
    }
}
