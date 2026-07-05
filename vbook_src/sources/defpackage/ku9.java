package defpackage;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ku9  reason: default package */
/* loaded from: classes.dex */
public final class ku9 implements ih3 {
    public final /* synthetic */ aw7 a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ at5 c;

    public ku9(aw7 aw7Var, aw7 aw7Var2, at5 at5Var) {
        this.a = aw7Var;
        this.b = aw7Var2;
        this.c = at5Var;
    }

    @Override // defpackage.ih3
    public final void M0(bh3 bh3Var) {
        this.b.setValue(Boolean.FALSE);
    }

    @Override // defpackage.ih3
    public final void S(bh3 bh3Var) {
        this.b.setValue(Boolean.TRUE);
    }

    @Override // defpackage.ih3
    public final void T0(bh3 bh3Var) {
        this.a.setValue(Boolean.TRUE);
        this.b.setValue(Boolean.FALSE);
    }

    @Override // defpackage.ih3
    public final void d0(bh3 bh3Var) {
        this.a.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [at5] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v7, types: [ks3] */
    @Override // defpackage.ih3
    public final boolean q1(bh3 bh3Var) {
        ?? arrayList;
        String str;
        this.a.setValue(Boolean.FALSE);
        ClipData clipData = bh3Var.a.getClipData();
        if (clipData == null) {
            arrayList = ks3.a;
        } else {
            ArrayList arrayList2 = new ArrayList();
            int itemCount = clipData.getItemCount();
            int i = 0;
            for (int i2 = 0; i2 < itemCount; i2++) {
                Uri uri = clipData.getItemAt(i2).getUri();
                if (uri != null) {
                    arrayList2.add(uri);
                }
            }
            arrayList = new ArrayList(tl1.s(arrayList2, 10));
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                Uri uri2 = (Uri) obj;
                f76 f76Var = null;
                if (c16.i(uri2.getScheme(), "content")) {
                    Context context = twe.e;
                    context.getClass();
                    ContentResolver contentResolver = context.getContentResolver();
                    Cursor query = contentResolver.query(uri2, new String[]{"_display_name"}, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                str = query.getString(query.getColumnIndexOrThrow("_display_name"));
                            } else {
                                str = null;
                            }
                            query.close();
                        } finally {
                        }
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    if (k4b.j0(str)) {
                        str = hl5.k(System.currentTimeMillis(), "drag_");
                    }
                    File file = new File(ie2.s(pe4.a).toFile(), "drag_and_drop");
                    file.mkdirs();
                    File file2 = new File(file, str);
                    InputStream openInputStream = contentResolver.openInputStream(uri2);
                    if (openInputStream != null) {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file2);
                            gae.e(openInputStream, fileOutputStream);
                            fileOutputStream.close();
                            openInputStream.close();
                            String str2 = hn8.b;
                            f76Var = new hh8(fn8.e(file2));
                        } finally {
                        }
                    }
                }
                if (f76Var == null) {
                    String uri3 = uri2.toString();
                    uri3.getClass();
                    Context context2 = twe.e;
                    context2.getClass();
                    f76Var = new wo(context2, uri3);
                }
                arrayList.add(f76Var);
            }
        }
        this.c.a(arrayList);
        return true;
    }
}
