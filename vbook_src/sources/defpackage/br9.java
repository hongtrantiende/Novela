package defpackage;

import android.content.res.Resources;
import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: br9  reason: default package */
/* loaded from: classes3.dex */
public final class br9 implements bq5 {
    public final Resources a;
    public final int b;
    public final String c;

    public br9(Resources resources, int i) {
        this.a = resources;
        this.b = i;
        this.c = a82.j(i, "android.resources:///");
    }

    @Override // defpackage.bq5
    public final osa a() {
        InputStream openRawResource = this.a.openRawResource(this.b);
        openRawResource.getClass();
        return tl1.K(openRawResource);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && br9.class == obj.getClass()) {
                br9 br9Var = (br9) obj;
                if (this.a.equals(br9Var.a) && this.b == br9Var.b) {
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
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return hl5.p(new StringBuilder("ResourceImageSource("), this.b, ')');
    }
}
