package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wo  reason: default package */
/* loaded from: classes3.dex */
public final class wo implements f76 {
    public final Context a;
    public final String b;

    public wo(Context context, String str) {
        str.getClass();
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.f76
    public final Object a(m42 m42Var) {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri parse = Uri.parse(this.b);
        parse.getClass();
        InputStream openInputStream = contentResolver.openInputStream(parse);
        try {
            openInputStream.getClass();
            byte[] n = gae.n(openInputStream);
            openInputStream.close();
            return n;
        } finally {
        }
    }

    @Override // defpackage.f76
    public final String b() {
        return this.b;
    }

    @Override // defpackage.f76
    public final String getName() {
        Uri parse = Uri.parse(this.b);
        parse.getClass();
        if (c16.i(parse.getScheme(), "content")) {
            try {
                Cursor query = this.a.getContentResolver().query(parse, new String[]{"_display_name"}, null, null, null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_display_name"));
                        string.getClass();
                        query.close();
                        return string;
                    }
                    query.close();
                }
            } catch (Throwable unused) {
            }
        }
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment != null) {
            return k4b.E0('/', lastPathSegment, lastPathSegment);
        }
        return NetworkResponseData.UNKNOWN_CONTENT_TYPE;
    }

    @Override // defpackage.f76
    public final Object v() {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri parse = Uri.parse(this.b);
        parse.getClass();
        InputStream openInputStream = contentResolver.openInputStream(parse);
        openInputStream.getClass();
        return tl1.K(openInputStream);
    }
}
