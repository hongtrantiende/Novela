package defpackage;

import android.graphics.drawable.Drawable;
import android.view.textclassifier.TextClassification;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cpb  reason: default package */
/* loaded from: classes.dex */
public final class cpb extends mob {
    public final TextClassification b;
    public final int c;
    public final Drawable d;

    public cpb(Object obj, TextClassification textClassification, int i, Drawable drawable) {
        super(obj);
        this.b = textClassification;
        this.c = i;
        this.d = drawable;
    }

    public final String toString() {
        TextClassification textClassification = this.b;
        return "TextContextMenuTextClassificationItem(key=" + this.a + ", textClassification=" + textClassification + ", index=" + this.c + ", icon=" + this.d + ")";
    }
}
