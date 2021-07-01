# coding: utf-8

"""
    Plataforma de Ressarcimento do Open Banking Brasil

    APIs da plataforma de Ressarcimento do Open Banking Brasil para a comunicação online com a plaforma. Através da documentação das APIs abaixo é possível realizar os devidos testes de integração.  # noqa: E501

    OpenAPI spec version: beta-0.0.1
    Contact: suporte-ressarcimento@openbankingbrasil.org.br
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""

from setuptools import setup, find_packages  # noqa: H301

NAME = "swagger-client"
VERSION = "1.0.0"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["urllib3 >= 1.15", "six >= 1.10", "certifi", "python-dateutil"]

setup(
    name=NAME,
    version=VERSION,
    description="Plataforma de Ressarcimento do Open Banking Brasil",
    author_email="suporte-ressarcimento@openbankingbrasil.org.br",
    url="",
    keywords=["Swagger", "Plataforma de Ressarcimento do Open Banking Brasil"],
    install_requires=REQUIRES,
    packages=find_packages(),
    include_package_data=True,
    long_description="""\
    APIs da plataforma de Ressarcimento do Open Banking Brasil para a comunicação online com a plaforma. Através da documentação das APIs abaixo é possível realizar os devidos testes de integração.  # noqa: E501
    """
)