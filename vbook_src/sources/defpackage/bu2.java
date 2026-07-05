package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bu2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bu2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cu2 b;

    public /* synthetic */ bu2(cu2 cu2Var, int i) {
        this.a = i;
        this.b = cu2Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.a) {
            case 0:
                cu2 cu2Var = this.b;
                synchronized (cu2Var) {
                    try {
                        m55 m55Var = (m55) cu2Var.a.get();
                        ArrayList a = m55Var.a();
                        synchronized (m55Var) {
                            m55Var.a.a(new tn4(m55Var));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < a.size(); i++) {
                            oc0 oc0Var = (oc0) a.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", oc0Var.a);
                            jSONObject.put("dates", new JSONArray((Collection) oc0Var.b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return byteArrayOutputStream;
            default:
                cu2 cu2Var2 = this.b;
                synchronized (cu2Var2) {
                    m55 m55Var2 = (m55) cu2Var2.a.get();
                    long currentTimeMillis = System.currentTimeMillis();
                    String a2 = ((ty2) cu2Var2.c.get()).a();
                    synchronized (m55Var2) {
                        m55Var2.a.a(new nq3(m55Var2, m55.b(currentTimeMillis), a2, s9e.y(a2)));
                    }
                }
                return null;
        }
    }
}
