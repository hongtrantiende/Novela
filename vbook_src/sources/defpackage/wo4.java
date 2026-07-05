package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wo4  reason: default package */
/* loaded from: classes.dex */
public abstract class wo4 {
    public static final ypa a = new ypa(2);
    public static final uk b = new uk(16);

    public static qy2 a(Context context, List list) {
        String str;
        Typeface c;
        Trace.beginSection(sxd.o("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                cp4 cp4Var = (cp4) list.get(i);
                if (Build.VERSION.SDK_INT >= 31 && (c = qsc.c((str = cp4Var.e))) != null && qsc.d(c) != null) {
                    arrayList.add(new fq4[]{new fq4(str, cp4Var.f)});
                } else {
                    ProviderInfo b2 = b(context.getPackageManager(), cp4Var, context.getResources());
                    if (b2 == null) {
                        return new qy2();
                    }
                    arrayList.add(c(context, cp4Var, b2.authority));
                }
            }
            return new qy2(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, vo4] */
    public static ProviderInfo b(PackageManager packageManager, cp4 cp4Var, Resources resources) {
        uk ukVar = b;
        ypa ypaVar = a;
        Trace.beginSection(sxd.o("FontProvider.getProvider"));
        try {
            List list = cp4Var.d;
            String str = cp4Var.a;
            String str2 = cp4Var.b;
            if (list == null) {
                list = pae.l(resources, 0);
            }
            ?? obj = new Object();
            obj.a = str;
            obj.b = str2;
            obj.c = list;
            ProviderInfo providerInfo = (ProviderInfo) ypaVar.h(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Collections.sort(arrayList, ukVar);
                    for (int i = 0; i < list.size(); i++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                        Collections.sort(arrayList2, ukVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                    break;
                                }
                            }
                            ypaVar.m(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    public static fq4[] c(Context context, cp4 cp4Var, String str) {
        String[] strArr;
        int i;
        int i2;
        Uri withAppendedId;
        int i3;
        boolean z;
        Trace.beginSection(sxd.o("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            String[] strArr2 = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            Trace.beginSection(sxd.o("ContentQueryWrapper.query"));
            String str2 = cp4Var.f;
            String str3 = cp4Var.c;
            if (str2 != null) {
                int length = str2.length();
                int i4 = 0;
                while (i4 < length) {
                    int codePointAt = str2.codePointAt(i4);
                    if (!Character.isWhitespace(codePointAt)) {
                        strArr = new String[]{str3, "VF"};
                        break;
                    }
                    i4 += Character.charCount(codePointAt);
                }
            }
            strArr = new String[]{str3};
            String[] strArr3 = strArr;
            if (acquireUnstableContentProviderClient != null) {
                try {
                    cursor = acquireUnstableContentProviderClient.query(build, strArr2, "query = ?", strArr3, null, null);
                } catch (RemoteException e) {
                    Log.w("FontsProvider", "Unable to query the content provider", e);
                }
            }
            Trace.endSection();
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                arrayList = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i = cursor.getInt(columnIndex);
                    } else {
                        i = 0;
                    }
                    if (columnIndex4 != -1) {
                        i2 = cursor.getInt(columnIndex4);
                    } else {
                        i2 = 0;
                    }
                    if (columnIndex3 == -1) {
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    Uri uri = withAppendedId;
                    if (columnIndex5 != -1) {
                        i3 = cursor.getInt(columnIndex5);
                    } else {
                        i3 = 400;
                    }
                    int i5 = i3;
                    if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new fq4(uri, i2, i5, z, cp4Var.f, i));
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            if (acquireUnstableContentProviderClient != null) {
                acquireUnstableContentProviderClient.close();
            }
            return (fq4[]) arrayList.toArray(new fq4[0]);
        } finally {
            Trace.endSection();
        }
    }
}
