package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wsc  reason: default package */
/* loaded from: classes.dex */
public final class wsc extends vsc {
    @Override // defpackage.vsc
    public final Font M(fq4 fq4Var) {
        String str;
        Font d;
        Uri uri = fq4Var.a;
        boolean equals = Objects.equals(uri.getScheme(), "systemfont");
        String str2 = fq4Var.e;
        if (equals) {
            str = uri.getAuthority();
        } else {
            str = null;
        }
        if (str != null) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create == null || create.equals(create2)) {
                create = null;
            }
            if (create != null && (d = qsc.d(create)) != null) {
                if (TextUtils.isEmpty(str2)) {
                    return d;
                }
                try {
                    return new Font.Builder(d).setFontVariationSettings(str2).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
