package defpackage;

import android.content.Context;
import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m00  reason: default package */
/* loaded from: classes3.dex */
public final class m00 implements bq5 {
    public final Context a;
    public final String b;
    public final String c;

    public m00(Context context, String str) {
        context.getClass();
        this.a = context;
        this.b = str;
        this.c = "file:///android_asset/".concat(str);
    }

    @Override // defpackage.bq5
    public final osa a() {
        InputStream open = this.a.getAssets().open(this.b);
        open.getClass();
        return tl1.K(open);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && m00.class == obj.getClass()) {
                m00 m00Var = (m00) obj;
                if (c16.i(this.a, m00Var.a) && this.b.equals(m00Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.bq5
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return s21.q(new StringBuilder("AssetImageSource('"), this.b, "')");
    }
}
