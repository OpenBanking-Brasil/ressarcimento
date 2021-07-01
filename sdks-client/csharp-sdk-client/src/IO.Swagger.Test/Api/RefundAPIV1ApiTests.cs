/* 
 * Plataforma de Ressarcimento do Open Banking Brasil
 *
 * APIs da plataforma de Ressarcimento do Open Banking Brasil para a comunicação online com a plaforma. Através da documentação das APIs abaixo é possível realizar os devidos testes de integração.
 *
 * OpenAPI spec version: beta-0.0.1
 * Contact: suporte-ressarcimento@openbankingbrasil.org.br
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing RefundAPIV1Api
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class RefundAPIV1ApiTests
    {
        private RefundAPIV1Api instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new RefundAPIV1Api();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of RefundAPIV1Api
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' RefundAPIV1Api
            //Assert.IsInstanceOfType(typeof(RefundAPIV1Api), instance, "instance is a RefundAPIV1Api");
        }

        /// <summary>
        /// Test FindNotificationById
        /// </summary>
        [Test]
        public void FindNotificationByIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string processId = null;
            //var response = instance.FindNotificationById(processId);
            //Assert.IsInstanceOf<RefundProcess> (response, "response is RefundProcess");
        }
        /// <summary>
        /// Test Healthcheck
        /// </summary>
        [Test]
        public void HealthcheckTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.Healthcheck();
            //Assert.IsInstanceOf<RefundProcess> (response, "response is RefundProcess");
        }
        /// <summary>
        /// Test Notification
        /// </summary>
        [Test]
        public void NotificationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //RefundNotification body = null;
            //var response = instance.Notification(body);
            //Assert.IsInstanceOf<RefundProcess> (response, "response is RefundProcess");
        }
        /// <summary>
        /// Test Notifications
        /// </summary>
        [Test]
        public void NotificationsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<RefundNotification> body = null;
            //var response = instance.Notifications(body);
            //Assert.IsInstanceOf<RefundProcess> (response, "response is RefundProcess");
        }
    }

}
