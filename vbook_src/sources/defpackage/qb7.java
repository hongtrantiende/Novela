package defpackage;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qb7  reason: default package */
/* loaded from: classes.dex */
public final class qb7 {
    public static final Charset b = Charset.forName("UTF-8");
    public final oe4 a;

    public qb7(oe4 oe4Var) {
        this.a = oe4Var;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(yt9.a(string));
            } catch (Exception e) {
                Log.w("FirebaseCrashlytics", "Failed de-serializing rollouts state. " + string, e);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(yt9.a.h(list.get(i))));
            } catch (JSONException e) {
                Log.w("FirebaseCrashlytics", "Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", eub.p("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    public final Map c(String str, boolean z) {
        File c;
        ?? r8;
        FileInputStream fileInputStream;
        Exception e;
        oe4 oe4Var = this.a;
        if (z) {
            c = oe4Var.c(str, "internal-keys");
        } else {
            c = oe4Var.c(str, "keys");
        }
        if (c.exists() && c.length() != 0) {
            Closeable closeable = null;
            try {
                try {
                    fileInputStream = new FileInputStream(c);
                    try {
                        HashMap a = a(fca.D(fileInputStream));
                        fca.f(fileInputStream, "Failed to close user metadata file.");
                        return a;
                    } catch (Exception e2) {
                        e = e2;
                        Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                        f(c);
                        fca.f(fileInputStream, "Failed to close user metadata file.");
                        return Collections.EMPTY_MAP;
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable = r8;
                    fca.f(closeable, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Exception e3) {
                fileInputStream = null;
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                fca.f(closeable, "Failed to close user metadata file.");
                throw th;
            }
        } else {
            g(c, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        String str2;
        File c = this.a.c(str, "user-data");
        Closeable closeable = null;
        if (c.exists()) {
            ?? r2 = (c.length() > 0L ? 1 : (c.length() == 0L ? 0 : -1));
            try {
                if (r2 != 0) {
                    try {
                        fileInputStream = new FileInputStream(c);
                        try {
                            JSONObject jSONObject = new JSONObject(fca.D(fileInputStream));
                            if (!jSONObject.isNull("userId")) {
                                str2 = jSONObject.optString("userId", null);
                            } else {
                                str2 = null;
                            }
                            String str3 = "Loaded userId " + str2 + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str3, null);
                            }
                            fca.f(fileInputStream, "Failed to close user metadata file.");
                            return str2;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            f(c);
                            fca.f(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        fca.f(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r2;
            }
        }
        String m = s21.m("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", m, null);
        }
        f(c);
        return null;
    }

    public final void h(String str, Map map, boolean z) {
        File c;
        BufferedWriter bufferedWriter;
        Exception e;
        oe4 oe4Var = this.a;
        if (z) {
            c = oe4Var.c(str, "internal-keys");
        } else {
            c = oe4Var.c(str, "keys");
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            String jSONObject = new JSONObject(map).toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), b));
            try {
                try {
                    bufferedWriter.write(jSONObject);
                    bufferedWriter.flush();
                    fca.f(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                    f(c);
                    fca.f(bufferedWriter, "Failed to close key/value metadata file.");
                }
            } catch (Throwable th) {
                th = th;
                bufferedWriter2 = bufferedWriter;
                fca.f(bufferedWriter2, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            fca.f(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }
}
